interface Father {
	void height();
}

interface Mother {
	void complexion();
}

class Child implements Father,Mother {
	public void height()
	{
		System.out.println("Height inherited from father");
	}

	public void complexion()
	{
		System.out.println("complexion inherited from mother");
	}
}


class MultipleInheritance {
	public static void main(String[] args)
	{
		Child c = new Child();
		c.height();
		c.complexion();
	}
}
