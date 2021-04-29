
public class SongToPlaylist {
	Integer playlistIndex;
	String song_id;
	public SongToPlaylist() {}
	
	public SongToPlaylist(Integer playlistIndex, String song_id) {
		this.playlistIndex = playlistIndex;
		this.song_id = song_id;
	}
	
	public Integer getPlaylistIndex() {
		return playlistIndex;
	}

	public void setPlaylistIndex(Integer playlistIndex) {
		this.playlistIndex = playlistIndex;
	}

	public String getSong_id() {
		return song_id;
	}

	public void setSong_id(String song_id) {
		this.song_id = song_id;
	}
}