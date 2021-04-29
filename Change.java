
public class Change {
	private AddChange add;
	private RemoveChange remove;
	
	public Change() { }
	public Change(AddChange add, RemoveChange remove) {
		this.add = add;
		this.remove = remove;
	}
	
	public AddChange getAdd() {
		return add;
	}
	public void setAdd(AddChange add) {
		this.add = add;
	}
	public RemoveChange getRemove() {
		return remove;
	}
	public void setRemove(RemoveChange remove) {
		this.remove = remove;
	}
	
	
}
