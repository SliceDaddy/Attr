package edu.saintjoe.cs.brianc.attr;
//Ryan Slipher AttrDriver from book
public class AttrDriver {
	
	public static void main(String[] args) {
	
	Attr one;
	Attr two;
	Attr three;
	
	one = new Attr("name", "Brian");
	two = new Attr("Height", 60);
	three = new Attr("Mystery");
	
	System.out.println(one.toString());
	System.out.println(two.toString());
	};
}	