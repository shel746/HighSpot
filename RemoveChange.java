import java.util.List;

public class RemoveChange {
	private List<Integer> playlist;
	public RemoveChange(List<Integer> playlist) {
		this.playlist = playlist;
	}
	public RemoveChange() {}
	
	public List<Integer> getPlaylist() {
		return playlist;
	}
	public void setPlaylist(List<Integer> playlist) {
		this.playlist = playlist;
	}
}
