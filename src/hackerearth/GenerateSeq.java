package hackerearth;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GenerateSeq {
	public static class Image {
        private String filename;
        private int width;
        private int height;
        public Image(String filename, int width, int height) {
            this.filename = filename;
            this.width = width;
            this.height = height;
        }
        /**
         * Two Images are considered equal if they have
         * the same filename (without the extension), and the
         * same number of pixels.
         * Thus, flag.jpg with width=60 height=40 is
         * equal to flag.gif with width=40 and height=60
         */
        public boolean equals(Object other) {
            Image o = (Image)other;
            if (filename == null || o.filename == null)
                return false;
            String[] components = filename.split("\\.");
            String[] ocomponents = o.filename.split("\\.");
            return components[0].equals(ocomponents[0]) && 
                width * height == o.width * o.height;
        }
        public String toString() {
            return "Image: filename=" + filename + " Size=" + width*height;
        }
    }

    public static void printImages(Set<Image> images) {
        for(Image image: images) {
        	if(!isEqual(image, images)){
        		System.out.println(image);
        	}
        }
    }
    
    public static boolean isEqual(Image image , Set<Image>set){
    	for(Image img : set){
    		if(img.equals(image)) return true;
    	}
    	return false;
    }

    public static void main(String[] args) {
        Image[] images = {new Image("flag.jpg", 40, 60),
                          new Image("flag.gif", 40, 60),
                          new Image("smile.gif", 100, 200),
                          new Image("smile.gif", 50, 400),
                          new Image("other.jpg", 40, 60),
                          new Image("lenna.jpg", 512, 512),
                          new Image("Lenna.jpg", 512, 512)};
        
        Set<Image> set = new HashSet<Image>(Arrays.asList(images));
        GenerateSeq.printImages(set);
    }
}

//public class GenerateSeq {
//	
//	public static void  generate(int g, int n){
//		if(g == 1){
//			for(int i = 1;i<=n;i++){
//				System.out.print(g+i);
//				System.out.print(" ");
//			}
//		}else{
//			for(int i =2;i<=n+1;i++){
//				System.out.print(g*i);
//				System.out.print(" ");
//			}
//		}
//	}
//	
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int testCase =  scanner.nextInt();
//		for(int i=0;i<testCase;i++){
//			int g = scanner.nextInt();
//			int n = scanner.nextInt();
//			generate(g,n);
//		}
//	}
//}



