import java.lang.module.Configuration;

public class poo {
    public static void main(String[] args) {
        Produto ele1=new Eletronico("Smartphone",59.95,"LG");
        ele1.detalhes();
        System.out.println();

        Produto l1=new Livro("Java para iniciantes","JAVEIRO",59.95);
        l1.detalhes();
        System.out.println();

        Produto r1=new Roupa("GG","Levis",59.95);
        r1.detalhes();
        System.out.println();

        Vendedor v1=new Vendedor("Carlos",3999.95,20000.00);
        v1.detalhes();
        System.out.println();

        v1.comissao(10);
        System.out.println();

        v1.detalhes();
        System.out.println("Bônus: R$" + v1.calcularbonus());

    }
}  class Funcionario{
    String nome;
    double salario;

    public  Funcionario(String nome, double salario){
        this.nome=nome;
        this.salario=salario;

    }
    public void detalhes(){
        System.out.println("Nome do Funcionario: "+nome);
        System.out.println("Salario do Funcionario: "+salario);
    }
}
class Produto{
    String nome;
    double preco;

        public  Produto(String nome, double preco){
            this.nome=nome;
            this.preco=preco;
        }

        public void detalhes() {
            System.out.println("Nome: "+nome);
            System.out.println("valor: " + preco);

        }
}
class Eletronico extends Produto{
    String marca;

    public Eletronico(String nome,double preco,String marca){
        super(nome,preco);
        this.marca=marca;
    }

    @Override
    public void detalhes() {
        super.detalhes();

        System.out.println("Marca: "+marca);

    }
}
class Roupa extends Produto{
    String Tamanho;
    public Roupa (String tamanho, String nome, double preco){
        super(nome,preco);
        this.Tamanho=tamanho;
    }

    @Override
    public void detalhes() {
        super.detalhes();
        System.out.println("Tamanho:"+Tamanho);
    }
}

class Livro extends Produto{

    String autor;
    public Livro(String nome,String autor, double preco){
        super(nome, preco);
        this.autor=autor;
    }

    @Override
    public void detalhes() {
        super.detalhes();
        System.out.println("Autor: "+autor);

    }
}

class Vendedor extends Funcionario{
    double vendasMensais;
    public Vendedor(String nome,double salario, double vendasMensais){
        super(nome, salario);
        this.vendasMensais=vendasMensais;
    } public void comissao(double percentual){
        if(percentual>0){
            double acrescimo=salario*(percentual/100);
            salario +=acrescimo;
            System.out.printf("Comissão aplicada: %.2f%% (R$%.2f a mais no salário)%n", percentual, acrescimo);
        }
    }
    public double calcularbonus(){
        return vendasMensais*0.05;
    }
}





