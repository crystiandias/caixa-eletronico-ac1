package ac1algoritimos;
import java.util.Scanner;
public class caixaeletronico {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		//variaveis
		int intcpf;
		int cpfsistem=1234567890;
		int cpfsistem2=12345678;
		int senha = 987654321;
		int senha2 = 7654321;
		int senhacliente;
		int g;
		double saldo=900.50;
		double saldo2=900.50;
		double deposito=0;
		double saque=0;
		double result = 0;
		double transferencia;
		
	for(int f =0;f<1;f++) {
	System.out.println("bem vindo ao banco ");
	System.out.println("digite seu cpf para iniciarmos a operação ");
		intcpf = ler.nextInt();
	if (intcpf==cpfsistem) {
		
		for(int i =1; i<3;i++) {
		System.out.println("por favor digite a sua senha agora ");
		senhacliente=ler.nextInt();
	  if ( i==2) {
			System.out.println("sua conta foi bloqueada e apagada ");
			cpfsistem=0;
			senha=0;
		}
		if (senhacliente==senha) {
	for(int a = 1 ;a>0;a++) {
	System.out.println("digite 1 para saldo");
	System.out.println("digite 2 para deposito");
	System.out.println("digite 3 para saque");
	System.out.println("digite 4 para transferencia");
	System.out.println("digite 0 para voltar ao inicio ");
	g=ler.nextInt();
	switch(g) {
	case 1:System.out.println("seu saldo é de "+saldo);break;
	
	case 2:System.out.print("digite valor de deposito ");
	deposito=ler.nextDouble();
	result=saldo+deposito;
	System.out.println("o saldo restante é "+result);
		break;
		
	case 3:System.out.print("digite valor de saque ");
	saque=ler.nextDouble();
	result=saldo-saque;
	System.out.println("o saldo restante é "+result);
	break;
	
	case 4:System.out.println("digite cpf da conta de destino ");
		   intcpf=ler.nextInt();
		   if(intcpf==cpfsistem2) {
		   System.out.print("digite o valor a ser transferido ");
		   transferencia=ler.nextDouble();
		   if(saldo>=transferencia){
		   saldo-=transferencia;
		   saldo2 +=transferencia;
		   System.out.println("transferencia efetuada com sucesso ");
		   System.out.println("o valor restante na sua conta é de "+saldo2);
		}
		else {System.out.print("valos transferencia maior que o valor "
				+ "em sua conta");}
		} break;
	
	case 0:a=-1;i=3;f=-1; break;
	}
	}
	}	
	}
	}
	
	
	else if(intcpf==cpfsistem2) {
		
		for(int i =1; i<3;i++) {
		System.out.println("por favor digite a sua senha agora ");
		senhacliente=ler.nextInt();
	  if ( i==2) {
			System.out.println("sua conta foi bloqueada e apagada ");
			cpfsistem2=0;
			senha=0;
		}
		if (senhacliente==senha2) {
	for(int a = 1 ;a>0;a++) {
	System.out.println("digite 1 para saldo");
	System.out.println("digite 2 para deposito");
	System.out.println("digite 3 para saque");
	System.out.println("digite 4 para transferencia");
	System.out.println("digite 0 para voltar ao inicio ");
	g=ler.nextInt();
	switch(g) {
	case 1:System.out.println("seu saldo é de "+saldo);break;
	
	case 2:System.out.print("digite valor de deposito ");
	deposito=ler.nextDouble();
	result=saldo+deposito;
	System.out.print("o saldo restante é "+result);
		break;
		
	case 3:System.out.print("digite valor de saque ");
	saque=ler.nextDouble();
	result=saldo-saque;
	System.out.println("o saldo restante é "+result);
	break;
	
	case 4:
		System.out.println("digite cpf da conta de destino ");
		intcpf=ler.nextInt();
		if(intcpf==cpfsistem) {
		System.out.println("digite o valor a ser transferido ");
		transferencia=ler.nextDouble();
		if(saldo2>=transferencia){
		saldo2-=transferencia;
		saldo +=transferencia;
		System.out.println("transferencia efetuada com sucesso ");
		System.out.println("o valor restante na sua conta é de "+saldo2);
		}
		else {System.out.println("valos transferencia maior que o valor "
				+ "em sua conta");}
		} break;
	
	case 0:a=-1;i=3;f=-1; break;
	}
	}
	}	
	}
	}
	else {
		System.out.println("cpf não existe no sistema");
	}
	}
}
}