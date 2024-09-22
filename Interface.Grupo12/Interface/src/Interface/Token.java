package Interface;


public class Token
{
    private int id;
    private String lexeme;
    private int position;

    public Token(int id, String lexeme, int position)
    {
        this.id = id;
        this.lexeme = lexeme;
        this.position = position;
    }

    public final int getId()
    {
        return id;
    }

    public final String getLexeme()
    {
        return lexeme;
    }

    public final int getPosition(String text)
    {
           int line = 1;
        for (int i = 0; i < position && i < text.length(); i++) {
            if (text.charAt(i) == '\n') {
                line++;
            }
        }
        return line;
//        return position;;
    }

       public String getTokenClassName() {
        switch (id) {
            case Constants.t_pr: return "pr";
            case Constants.t_id: return "id";
            case Constants.t_cte_int: return "cte_int";
            case Constants.t_cte_real: return "cte_real";
            case Constants.t_string: return "String";
            case Constants.t_main: return "Main";
            case Constants.t_read: return "Read";
            case Constants.t_true: return "True";
            case Constants.t_false: return "False";
            case Constants.t_write: return "Write";
            case Constants.t_writeln: return "Writeln";
            case Constants.t_if: return "If";
            case Constants.t_elif: return "Elif";
            case Constants.t_else: return "Else";
            case Constants.t_repeat: return "Repeat";
            case Constants.t_until: return "Until";
            case Constants.t_while: return "While";
            
            default: return "Token inválido ";
        }
    }
       
       
    public String toString()
    {
        return id+" ( "+lexeme+" ) @ "+position;
    };
}
