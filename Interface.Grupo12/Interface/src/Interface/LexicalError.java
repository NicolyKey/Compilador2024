package Interface;


public class LexicalError extends AnalysisError
{
    public LexicalError(String msg, int position)
	 {
        super(msg, position);
    }

    public LexicalError(String msg)
    {
        super(msg);
    }
    
      public LexicalError() {
        super("Erro léxico não especificado"); // Mensagem padrão
    }
}
