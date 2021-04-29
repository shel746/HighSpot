import java.util.List;

public class AddChange {
	private List<SongToPlaylist> songToPlaylist;
	private List<Playlist> playlist;
	
	public AddChange(List<SongToPlaylist> songToPlaylist, List<Playlist> playlist) {
		this.songToPlaylist = songToPlaylist;
		this.playlist = playlist;
	}
	public AddChange() {}
	
	public List<SongToPlaylist> getSongToPlaylist() {
		return songToPlaylist;
	}
	
	public void setSongToPlaylist(List<SongToPlaylist> songToPlaylist) {
		this.songToPlaylist = songToPlaylist;
	}

	public List<Playlist> getPlaylist() {
		return playlist;
	}

	public void setPlaylist(List<Playlist> playlist) {
		this.playlist = playlist;
	}
	
}
