
public class Application {
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setNome("Arya");
        helloWorld.imprimir();

        HelloWorld helloWorld1 = new HelloWorld();
        helloWorld1.setNome("Sansa");
        helloWorld1.imprimir();

        HelloWorld helloWorld2 = new HelloWorld();  // 1ª instrução
        helloWorld2.setNome("Daenerys");           // modificar o nome
        helloWorld2.imprimir();                     // Imprimir o nome

        HelloWorld helloWorld3 = new HelloWorld();  // 2ª Instrução
        helloWorld3.imprimir();             // Somente a impressão do nome

        // A 3ª instrução foi alterar o sistema para SEMPRE imprimir com a hora









    }
}
