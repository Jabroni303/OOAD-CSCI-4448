import java.util.ArrayList;

public class main{

   public static void main(String[] args){
      Reader reader = new Reader(); // instantiate reader object
      Analyzer analyzer = new Analyzer(); //instantiate analyzer object
      reader.input(); // read data from the user
      analyzer.analyze(); //run analysis functions
    
}
}