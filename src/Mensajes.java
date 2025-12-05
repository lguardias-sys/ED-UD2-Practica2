//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Mensajes{

    public void main(String[] args) {

        int num = 20;
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println(String.format("Hello and welcome!"));

        for (int i = 1; i <= num; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("Función " + i + ": " + distribuidor(i));
        }
    }

    public String distribuidor(int i) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        switch(i) {
            case 1:
                return metodo01();// code block
            case 2:
                return metodo02();// code block
            case 3:
                return metodo03();// code block
            case 4:
                return metodo04();
            case 5:
                return metodo05();
            case 6:
                return metodo06();
            case 7:
                return metodo07();
            case 8:
                return metodo08();
            case 9:
                return metodo09();
            case 10:
                return metodo10();
            case 11:
                return metodo11();
            case 12:
                return metodo12();
            case 13:
                return metodo13();
            case 14:
                return metodo14();
            case 15:
                return metodo15();
            case 16:
                return metodo16();
            case 17:
                return metodo17();
            case 18:
                return metodo18();
            case 19:
                return metodo19();
            case 20:
                return metodo20();
            default:
                return "Fuera de rango";
                // code block
        }
    }
    public String metodo01 () {
        return "Dejo el grado";
    }
    public String metodo02 () {
        return "dos";
    }
    public String metodo03 () {
        return "tres";
    }
    public String metodo04 () {
        return "Hola mundo, soy Héctor !!!";
    }
    public String metodo05 () {
        return "erm i uh do the uh coding stuff and such i suppose perchancebaly uh, pablo";
    }
    public String metodo06 () {
        return "seis";
    }
    public String metodo07 () {
        return "Hola soy andres stan";
    }
    public String metodo08 () {
        return "ocho";
    }
    public String metodo09 () {
        return "nueve";
    }
    public String metodo10 () {
        return "diez";
    }
    public String metodo11 () {
        return "once";
    }
    public String metodo12 () {
        return "doce";
    }
    public String metodo13 () {
        return "trece";
    }
    public String metodo14 () {
        return "catorce";
    }
    public String metodo15 () {
        return "quince";
    }
    public String metodo16 () {
        return "dieciseis";
    }
    public String metodo17 () {
        return "diecisiete";
    }
    public String metodo18 () {
        return "dieciocho";
    }
    public String metodo19 () {
        return "diecinueve";
    }
    public String metodo20 () {
        return "prueba elicia 20";
    }
}