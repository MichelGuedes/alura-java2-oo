import java.io.FileNotFoundException;

public class TestandoAberturaArquivo {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException {
		try {
			new java.io.FileInputStream("arquivo.txt");	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception ex){
			ex.printStackTrace();
		}
		
	}

}
