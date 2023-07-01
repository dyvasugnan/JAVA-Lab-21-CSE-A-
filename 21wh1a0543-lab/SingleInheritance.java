package javaprograms;

	
	class One {
	     int num;

	    One(int num) {
	        this.num = num;
	    }

	     void display() {
	        System.out.println("Number: " + num);
	    }
	}

	class Two extends One {
	     Two(int num) {
	        super(num);
	    }

	     void display() {
	        super.display();
	        System.out.println("Double num: " + (num * 2));
	    }
	}

	 class SingleInheritance {
	     static void main(String[] args) {
	        Two t = new Two(5);
	        t.display();
	    }
	}


