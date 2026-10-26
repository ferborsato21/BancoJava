package Back;

import java.util.Scanner;

import projetoBanco.metodos;

public class main {
	public static void main(String[] args) {		
		metodos mt= new metodos();
		Scanner sc = new Scanner (System.in);
		String verificacao= "";
		mt.setsaldo(1000);
		int resposta = 1;
		// Será pedido ao usuario login e senha até que seja colocado algum exixtente 
	while (verificacao.equals("")) {
		
			
		System.out.println("por favor digite o login ");
		String login = sc.nextLine();
		System.out.println("por favor digite a senha ");
		String senha = sc.nextLine();
		 verificacao = mt.Login(login, senha);
	} mt.credito();
		if (verificacao.equals("Fernando")) {
			mt.setsaldo(1824.66);
			mt.senhaTransaçao=  100577;
		}else if (verificacao.equals("Vitor")) {
			mt.setsaldo(900);
			mt.senhaTransaçao =1234;
		}else if (verificacao.equals("Fabiana")) {
			mt.setsaldo(1500);
			mt.senhaTransaçao =210606;
		}else if (verificacao.equals("Nelson")) {
			mt.setsaldo(2000);
			mt.senhaTransaçao=210606;

		} else {
			System.exit(0);
		}
		System.out.println("bem vindo "+ verificacao);
		String opcoes = """
				1 ver saldo 
				2 realizar transação
				3 depositar
				4 ver credito 
				5 usar credito
				""";
		// laço de repetição para repetir as opções
   while (resposta >= 1 && resposta <=6 ) {
	   System.out.println("estas são as opções disponiveis no momento " );
	   System.out.println(opcoes);
	   resposta = sc.nextInt();
	   switch (resposta) {
	  //mostra o saldo atual 
	   case 1 :
		 System.out.println( mt.getsaldo());
	   break;
	//  o case 2 faz a transferencia  
	   case 2 :
		
		   System.out.println("qual valor deseja tranferir?");
		   double valorTransacao = sc.nextDouble();
		  System.out.println("digite a senha de transação");
		 int senhaDeTransacao = sc.nextInt();
		 if (senhaDeTransacao == mt.senhaTransaçao) {
		   if (valorTransacao > mt.getsaldo()) {
			   System.out.println("vc não possui saldo suficiente na conta ");
		   } else if (valorTransacao == mt.getsaldo()) {
			   System.out.println("após realizar essa transacao vc não terá mais saldo disponivel");
System.out.println("se desejar continuar digite sim ");
String confirmacaoTransacao = sc.nextLine().toLowerCase();;
if (confirmacaoTransacao.equals("sim")|| confirmacaoTransacao.equals("s")) {
	mt.setsaldo(0.0);
} 
		   }else if ((valorTransacao<0 || valorTransacao==0)) {
			   System.out.println("não é possivel depositar esse valor ");
		   }
		   else if (valorTransacao < mt.getsaldo()) {
			  double x =  mt.getsaldo() -valorTransacao;
			   mt.setsaldo(x);
			  System.out.println("esse é o seu saldo atual: "+ mt.getsaldo());
		   }
		 } else {
			 System.out.println("senha incorreta");
		 }
		   break;
	
		   // deposita algum valor 
		  case 3 :
		System.out.println("qual valor deseja que seja depositado?");
		double valorDeposito = sc.nextDouble();
		if (valorDeposito < 0) {
			System.out.println("não é possivel depositar valor negativo");
		}else {
		double y = mt.getsaldo() + valorDeposito;
		mt.setsaldo(y);
		System.out.println("este é o seu saldo atual: " + mt.getsaldo());
		}
	   break;
		
	   // mostra o credito dp usuario   
	   case 4:
			   
			   
			   System.out.println("você possui "+ mt.getcreditos()+ " creditos");
	   break;
		
	   // usa quanto de credito o usuario deseja usar 
	   case 5 :
			   System.out.println("Quanto de credito deseja usar??");
			   double credito = sc.nextDouble();
					  
			   if (credito >mt.getcreditos()) {
				   System.out.println("Você não possuia essa quantidade de credito ");
			   } else if ( credito== 0 || credito<0 ) {
				   System.out.println("não é possivel usar essa quantidade de credito ");
			   }
					   else { 
				   System.out.println("digite a senha de transação ");
				   senhaDeTransacao = sc.nextInt();
				   if (senhaDeTransacao == mt.senhaTransaçao) {
				   mt.setcreditos(mt.getcreditos() - credito);
				   System.out.println("Você pode pagar em até 3 meses em quantos meses deseja pagar ");
				   int mesesApagar = sc.nextInt();
				   switch (mesesApagar) {
				   case 1 :
					   System.out.println("Você irá pagar "+ credito +" no mês que vem " );
					   break;
				   case 2 :
					   System.out.println("Você irá pagar " + (credito/2) + " pelos proximos 2 meses " );
					   break;
				   case 3 :
					   System.out.println("Você irá pagar " + (credito/3) + " pelos proximos 3 meses ");
					   break;
					   default:
						   System.out.println("não é possivel pagar em " + credito + "meses");
				   }
				   }
				   }
			 
	   /* switch da resposta do usuario  */}
	   
   /*repetição das opçoes */ }
	/* main*/}
	/*Classe */}
