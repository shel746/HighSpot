
import java.io.*;
import java.nio.file.Paths;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
public class HighSpotCLI {
	
   public static void main(String[] args) {
	   
		try {
			ObjectMapper mapper = new ObjectMapper();
			Mixtape mixtape = mapper.readValue(Paths.get(args[0]).toFile(), Mixtape.class);
			
			Change changes = mapper.readValue(Paths.get(args[1]).toFile(), Change.class);
			for(SongToPlaylist songToPlaylist : changes.getAdd().getSongToPlaylist()) {
				mixtape.addSongToPlaylist(songToPlaylist);
			}
			mixtape.addPlaylists(changes.getAdd().getPlaylist());
			for(Integer playlistIndex : changes.getRemove().getPlaylist()) {
				mixtape.removePlaylist(playlistIndex);
			}
			
			ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
			writer.writeValue(new File("output.json"), mixtape);
		} catch (Exception e) {
			e.printStackTrace();
		}
   }
}