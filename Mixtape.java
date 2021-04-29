import java.util.List;

public class Mixtape {
	private List<User> users;
	private List<Playlist> playlists;
	private List<Song> songs;
	
	public Mixtape() {}
	
	public Mixtape(List<User> users, List<Playlist> playlists, List<Song> songs) {
		this.users = users;
		this.playlists = playlists;
		this.songs = songs;
	}
	
	public void addPlaylists(List<Playlist> playlist) {
		playlists.addAll(playlist);
	}
	
	public void removePlaylist(int index) {
		if(index < playlists.size()) {
			playlists.remove(index);
		}
	}
	
	public void addSongToPlaylist(SongToPlaylist songToPlaylist) {
		int playlistIndex = songToPlaylist.getPlaylistIndex();
		String songId = songToPlaylist.getSong_id();
		playlists.get(playlistIndex).addSong(songId);
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<Playlist> getPlaylists() {
		return playlists;
	}

	public void setPlaylists(List<Playlist> playlists) {
		this.playlists = playlists;
	}

	public List<Song> getSongs() {
		return songs;
	}

	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}
}
