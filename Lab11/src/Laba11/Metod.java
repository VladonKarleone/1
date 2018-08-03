package Laba11;
import Laba11.Note;

public class Metod {
	Note head;
	Note tail; 
	// конструктор
	public Metod() {
		head = new Note("", null, null);
		tail = new Note("", head, head);
			head.Next = tail;
			head.Prev = tail;
	}

	public void AddToSpisok (String data) {
		Note p = new Note(data, tail, tail.Prev);
		tail.Prev.Next = p;
		tail.Prev = p;
	}
	

	public String OutSpisok () {
		String str = "";
		Note p = head.Next; 
		while (p != tail) {
			str += p.data + " ";
			p = p.Next;
		}
		return str;
	}
	

		public boolean Search(String str) {
			Note p = head.Next; 
			while(p != tail) {
				if (str.equals(p.data)) {
					return true;
				}
				p = p.Next;
			}
			return false;	
		}
		

		public void DeletElement (String str) {
			Note p = head.Next;
			while (p != tail) {
				if (str.equals(p.data)) {
					p.Prev.Next = p.Next;
					p.Next.Prev = p.Prev;
					break;
				}
				p = p.Next;
			}
		}
}
