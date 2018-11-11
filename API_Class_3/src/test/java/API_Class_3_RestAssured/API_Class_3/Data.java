// private variables and their getters and setters for post, put and patch method

package API_Class_3_RestAssured.API_Class_3;

public class Data {
	
		private int id;
		private String title;
		private String author;
		
		public int getId() {
			return id;
		}
		
		public void setId(int id) {
			this.id = id;
		}
		
		public String getTitle() {
			return title;
		}
		
		public void setTitle(String title) {
			this.title = title;
		}
		
		public String getAuthor() {
			return author;
		}
		
		public void setAuthor(String author) {
			this.author = author;
		}

}