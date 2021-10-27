
	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	public class Assignment34 {

		public static void main(String[] args) throws IOException {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the start index:");
			int startIndex=Integer.parseInt(br.readLine());
			System.out.println("Enter the end index:");
			int endIndex=Integer.parseInt(br.readLine());
			FileReader fr=new FileReader("Outcome.txt");
			fr.skip(startIndex);
			int ch=fr.read();
			while(ch!=endIndex)
			{
				System.out.println((char)ch);
				ch=fr.read();
			}
			fr.close();
		}

	}


