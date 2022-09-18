package homework1;

public enum BookType {PYSCHOLOGY("Pyschology"), SCIENTIFIC("Scientific"), DRAMATIC("Dramatic"), FANTASY("Fantasy");

		public String description;

	    BookType(String description) {
	        this.description = description;

	    }

	    public void setDescription(String description) {
	        this.description = description;
	    }
	}