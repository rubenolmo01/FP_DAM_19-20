package utils;

public class java2 {

	public static void main(String[] args) {
		/*
		 *Haz un programa en Java para jugar contra el ordenador a adivinar un número, generado aleatoriamente (Math.random(), entre 1 y 200. El usuario debe introducir un número por teclado 
		 *y el programa le dirá mediante los símbolos '<' o '>', si el número introducido es menor o mayor que el generado por el ordenador.
		 * Finalmente, se mostrará un mensaje informando de cuantos intentos se han necesitado para adivinar el número y si no se adivina se mostrará un mensaje diciendo que ha perdido. El número máximo de intentos se pedirá por teclado.
		 * @author Fco.Javier Cano
		 */
		public static void randomGame()
		{
				Scanner input = new Scanner(System.in);
				boolean found = false;
				System.out.print("Introduzca el número máximo de intentos: ");
				int MaxTries = input.nextInt();
				int number = (int)(Math.random()*200);
				int tries = 0;
				int N;
				do 
				{
					System.out.print("Introduzca un número: ");
					N = input.nextInt();
					System.out.println();
					++tries;
					found = N == number;
					if (number > N )
					{
						System.out.println('>');
					}else if (number < N)
					{
						System.out.println('<');
					}
					
				} while (MaxTries > tries && !found);

				System.out.println((found) ? "Has acertado en "+tries+" intentos": "You lose");

				input.close();
		}

		/*
		 * Haz un programa en Java que muestre si dos números son o no amigos. 
		 * Los números se pedirán por teclado. 
		 * Dos números son amigos si la suma de los divisores del primero es el número y viceversa,
		 *  excluimos en la suma el propio número.
		 * @author Fco.Javier Cano
		 */
		public static int SumDivi(int N)
		{
			int aux = 0;
			for (int i = 0; i < N; i++)
			{
				if (N % i == 0)
				{
					aux += i;
				}
			}
			return aux;
		}
		public static void amigos()
		{
			Scanner input = new Scanner(System.in);
			int a,b;
			a = input.nextInt();
			b = input.nextInt();
			boolean friends = ( a == SumDivi(b)) && (b == SumDivi(a));
			System.out.println(friends ? "Son amigos" :"No son amigos");
			
			input.close();
		}
		
		/*
		 * Haz un programa que muestre un contador con 3 dígitos. Mostrará los números del 0-0-0 al 9-9-9, 
		 * cada vez que aparezca un 3 lo sustituiremos por una E.
		 * @author Fco.Javier Cano
		 */
		public static void count3E()
		{
			for (int i = 0; i <= 9; ++i)
			{
				System.out.print((i == 3 ? "E" : i)+"-");
				for (int j = 0; j <= 9; ++j)
				{
					System.out.print((j == 3 ? "E" : j)+"-");
					for (int p = 0; p <= 9; ++p)
					{
						System.out.print(p == 3 ? "E" : p);
					}	
				}
				System.out.println();
			}
			
		}
		/*
		 * Modificar el programa anterior para que la cantidad de dígitos del contador venga dada por el usuario.
		 * @author Fco.Javier Cano
		 */
		public static void unlimitedCounterDigits()
		{
			Scanner input = new Scanner(System.in);
			int N = input.nextInt();
			
			for (int i = 0; i <= 9; ++i)
			{
				for (int n = 0; n < N; ++n)
				{
					System.out.print(i == 3 ? "E" : i);					
					System.out.print(N-1 == n ? "\n" : "-");
				}			
				
			}
			input.close();
		}
		//	 
		/*
		 *Para obtener el número del tarot de una persona, 
		 *hay que sumar los números de su fecha de nacimiento y reducirlo a un solo dígito.
		 *Ejemplo de Julio de 1980 sería igual a: 1+7+1980 = 1988 → 1+9+9+8 = 27 → 2+7=9, por lo tanto, 
		 *el número del tarot sería el 9.
		 * @author Fco.Javier Cano
		 */
		public static void tarotPersona()
		{
			int tarot =0;
			Scanner input = new Scanner(System.in);
			int fnac = input.nextInt();
			while(fnac > 0)
			{
				tarot += (fnac % 10);
				fnac /= 10;
				if (fnac < 10)
				{
					tarot += fnac;
					fnac = tarot;
				}
			}
			System.out.println("Número tarot: "+fnac);
			input.close();
		}

		/*
		 * Realiza un programa que pida números hasta que se introduzca cero o un número negativo
		 * , tras esto, se deberá mostrar la cantidad de números introducidos.
		 * @author Fco.Javier Cano
		 */
		public static void cantidadIntroducidos()
		{
			int contador =0;
			Scanner input = new Scanner(System.in);
			int valor;
			
			do
			{
				valor = input.nextInt();
				++contador;
			}while(valor <= 0);
			System.out.println("Cantidad de números introducidos"+contador);
			input.close();
		}
		/*
		 *Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar las facturas. 
		 *En cada factura figura: el código del artículo, la cantidad vendida en litros y el precio por litro.
		 *Se pide de 5 facturas introducidas: Facturación total, cantidad en litros vendidos del artículo con código 1.
		 *cuantas facturas se emitieron de más de 600 €.
		 * @author Fco.Javier Cano
		 */
		public static void gestionFacturas()
		{
			Scanner input = new Scanner(System.in);
			int codArticulo;
			double cantidadLitrosVendidos,precioLitro;
			
			for (int i = 0; i < 5; ++i)
			{
				System.out.print("Inserte el código ");
				codArticulo = input.nextInt();
				System.out.println();
				
				System.out.print("Inserte la cantidad de litros comprado: ");
				cantidadLitrosVendidos = input.nextDouble();
				System.out.println();
				
				System.out.print("Inserte el precio litro: ");
				precioLitro = input.nextDouble();
				System.out.println();
				
				if (codArticulo == 1 || (cantidadLitrosVendidos * precioLitro) >= 600)
				{
					System.out.println("Facturación total = "+(cantidadLitrosVendidos * precioLitro)
							+", cantidad en litros: "+cantidadLitrosVendidos+", precio litro "+precioLitro
							+" código del artículo "+codArticulo);
				}
			}
			input.close();
		}

		/*
		 * Modificar el programa anterior para la empresa solo tenga tres productos,
		 * con los siguientes precios:  1- 0,6 €/litro, 2- 3 €/litro y 3- 1,25 €/litro.
		 * @author Fco.Javier Cano
		 */
		public static void comprTresProductos()
		{
			Scanner input = new Scanner(System.in);
			int codArticulo;
			double cantidadLitros;
			double precioLitro;
			for (int i = 0; i < 5; i++) 
			{
				do
				{
					System.out.print("Introduzca un código de artículo válido (entre uno y tres): ");
					codArticulo = input.nextInt();
					System.out.println();
					
				} while ( !(codArticulo >= 1 && codArticulo <= 3));
				
				System.out.println("Inserte la cantidad de litros");
				cantidadLitros = input.nextDouble();
				
				if (codArticulo == 1)
				{
					precioLitro = 0.6d;
				}
				else 
				{
					precioLitro = codArticulo == 2 ? 3 : 1.25d;
				}
				
				if (codArticulo == 1 || precioLitro * cantidadLitros >= 600 ) 
				{
					System.out.println("Facturación total = "+(cantidadLitros * precioLitro)
							+", cantidad en litros: "+cantidadLitros+", precio litro "+precioLitro
							+" código del artículo "+codArticulo);
				}	
			}
			
			input.close();
		}

		/*
		 * Realiza un programa que pida números hasta que se introduzca cero o un número negativo, 
		 * y diga cuál es el mayor número introducido y cuantas veces se repite.
		 * @author Fco.Javier Cano
		 */
		public static void mayorYNVeces()
		{
				int contador = 1;
				double max,valor;
				Scanner input = new Scanner(System.in);
				valor = input.nextDouble();
				max = valor;
				while (valor > 0.0d) 
				{
					valor = input.nextDouble();
					if (max < valor)
					{
						max = valor;
						contador=0;
					}
					++contador;
				} 
				System.out.println("El número mayor es"+max+" y se ha repetido "+contador+" veces");
				input.close();
		}
		/*
		 * Haz un programa que pida un número n, y diga cuantos y cuales números primos hay entre 1 y n.
		 * @author Fco.Javier Cano
		 */
		public static boolean esPrimo(int _N)
		{
			boolean esPrimo = _N > 1;
			int contador = 2;
			while(esPrimo && contador < _N) 
			{
				esPrimo = _N % contador != 0;
				++contador;
			}
			return esPrimo;
		}
		public static void nPrimos()
		{
			Scanner input = new Scanner(System.in);
			int N = input.nextInt();
			int contador = 0;
			System.out.print("Primos encontrados: ");
			for (int i = 0; i < N; ++i)
			{
				if (esPrimo(i))
				{
					System.out.print(i+" ");		
					++contador;
				}
			}
			System.out.println(" se han encontrado un total de "+contador+" primos.");
			input.close();
			
		}

		/*
		 * Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por espacios.
		 * @author Fco.Javier Cano
		 */
		public static void mostrarAleatorios()
		{
			for (int i = 0; i < 20; ++i)
			{
				System.out.println((int)(Math.random()*10)+" ");
			}
		}
		/*
		 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados por espacios.
		 *  Muestra también el máximo, el mínimo y la media de esos números.
		 * @author Fco.Javier Cano
		 */
		public static void _50Aleatorios()
		{
			int contador = 0;
			int max, min, aux;
			double media;
			max = (int)(Math.random()*99)+100;
			min = max;
			media = max;
			++contador;
			do 
			{
				aux = (int)(Math.random()*99)+100;
				if (max < aux) 
				{
					max = aux;
				} else if(min > aux) 
				{
					min = aux;
				}
				media += max;
				++contador;
			}while(contador < 50);
			System.out.println("El mayor número introducido es: "+max
							  +" El menor número introducido es: "+min
							  +"La media de los números introducidos es "+media/contador);
		}
			
		/*
		 * Realiza un programa que pinte la letra U por pantalla hecha con asteriscos.
		 * El programa pedirá la altura. Ejemplo:
		 * @author Fco.Javier Cano
		 */
		public static void letraU()
		{
				Scanner input = new Scanner(System.in);
				System.out.println("Introduzca la altura: ");
				int altura = input.nextInt();
				for (int i = 0; i < altura; ++i)
				{
					for (int j = 0; j < altura; ++j) 
					{
						System.out.print(((i < altura -1) && (j == 0 || j == altura-1)) 
										 || ((i == altura -1) && !(j == 0 || j == altura-1))
										     ?"*": " ");
					}
					System.out.println();
				}
				input.close();
		}
	 
		/*
		 * Haz un programa que pida un número, entre 0 y 10,
		 * y escriba un triángulo invertido con dichos números. Por ejemplo, si n=10:
		 * @author Fco.Javier Cano
		 */
		public static void trianguloInvertido()
		{
			Scanner input = new Scanner(System.in);
			int N; 
			do 
			{
				System.out.println("Inserte in nivel para el triángulo invertido: ");
				N = input.nextInt();	
			} while (!(N >= 0 && N <= 10));
			
			for (int i = 0; i < N; i++)
			{
				for (int j = i; j < N; ++j)
				{
					System.out.print(j+(j == N-1 ? "\n":","));
					
				}
			}
			
			input.close();
		}
		/*
		 * Realiza un programa que devuelva la cantidad de vocales, consonantes y espacios en una cadena dada. 
		 * Supondremos que no las vocales no estarán acentuadas.
		 * @author Fco.Javier Cano
		 */
		public static void cantidadEnCadenas(String _cadena)
		{
			int vocales, consonantes, espacios;
			char aux;
			vocales = 0;
			consonantes = 0;
			espacios = 0;
			
			for (int i = 0; i < _cadena.length(); ++i)
			{
				aux = _cadena.toLowerCase().charAt(i);
				if (Character.isWhitespace(aux))
				{
					++espacios;
				}else if (Character.isLetter(aux))
				{
					if (aux == 'a' ||aux == 'e' ||aux == 'i' ||aux == 'o' ||aux == 'u')
					{
						++vocales;
					} else
					{
						++consonantes;
					}
				}
			}
			System.out.println("La cadena introducida contiene:");
			System.out.println("- "+vocales+" vocales");
			System.out.println("- "+consonantes+" consonantes");
			System.out.println("- "+espacios+" espacios");
		}
		/*
		 *Pedir un número entero y decir si es capicúa, es decir, por ejemplo: 1001 es capicúa.
		 * @author Fco.Javier Cano
		 */
		public static boolean esCapicuo()
		{
			Scanner input = new Scanner(System.in);
			int nCifras = 0;
			System.out.println("Introduzca el número a comprobar si es capicuo: ");
			int N = input.nextInt();
			int original = N;
			int nInvertido = 0;
			boolean esCapicuo = N < 10;
			while (N > 0) 
			{
				N /= 10;
				++nCifras;
			}
			N = original;
			for (int i = nCifras-1; i >= 0; --i) 
			{
				nInvertido = nInvertido + ((N%10)*(int)Math.pow(10, i));//Se puede implementar una función potencia
				N /= 10;			
			}
			esCapicuo |= (nInvertido != 0 && nInvertido == original);
			input.close();
			return esCapicuo;
		}

		/*
		 *Realiza un programa que muestre al azar el nombre de una carta de la baraja francesa 
		 *(cuatro palos: picas, corazones, diamantes y tréboles. Cada palo está formado por 13 cartas, 
		 *de las cuales 9 cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A que sería el 1)
		 * @author Fco.Javier Cano
		 */
		public static void palo(int palo,boolean _española) 
		{
			switch (palo)
			{
			case 0:
				System.out.print(_española? "oros":" picas");
			break;
			case 1:
				System.out.print(_española? "copas":" corazones");
			break;
			case 2:
				System.out.print(_española? "espadas":" diamantes");
			break;
			case 3:
				System.out.print(_española? "bastos":" tréboles");
			break;
			default:
				System.out.println("Error");
				break;
			}			
		}
		public static void carta(int carta) 
		{
			switch (carta)
			{
			case 0:
				System.out.print(" A");
			break;
			case 1:
				System.out.print(" 2");
			break;
			case 2:
				System.out.print(" 3");
			break;
			case 3:
				System.out.print(" 4");
			break;
			case 4:
				System.out.print(" 5");
			break;
			case 5:
				System.out.print(" 6");
			break;
			case 6:
				System.out.print(" 7");
			break;
			case 7:
				System.out.print(" 8");
			break;
			case 8:
				System.out.print(" 9");
			break;
			case 9:
				System.out.print(" 10");
			break;
			case 10:
				System.out.print(" J");
			break;
			case 11:
				System.out.print(" Q");
			break;
			case 12:
				System.out.print(" K");
			break;
			default:
				System.out.println("Error");
				break;
			}
		}
		public static void cartasFrancesa()
		{
			int palo, carta;
			boolean generar = true;
			Scanner input = new Scanner(System.in);
			Random r = new Random();
			do
			{
				palo = r.nextInt(3);
				carta = r.nextInt(12);
				System.out.print("Se ha generado una carta de:");
				palo(palo,false);
				carta(carta);
				System.out.println("\n Dese generar otra carta¿? true or false");
				generar = input.nextBoolean();
			}while (generar);
			input.close();
		}
		/*
		 * Modificar el ejercicio anterior para que trabaje con la baraja española. 
		 * Esta consta de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
		 * @author Fco.Javier Cano
		 */

		public static void cartaEspañola(int carta) 
		{
			switch (carta)
			{
			case 0:
				System.out.print(" as");
			break;
			case 1:
				System.out.print(" 2");
			break;
			case 2:
				System.out.print(" 3");
			break;
			case 3:
				System.out.print(" 4");
			break;
			case 4:
				System.out.print(" 5");
			break;
			case 5:
				System.out.print(" 6");
			break;
			case 6:
				System.out.print(" 7");
			break;
			case 8:
				System.out.print(" sota");
			break;
			case 9:
				System.out.print(" caballo");
			break;
			case 10:
				System.out.print(" rey");
			break;
			default:
				System.out.println("Error");
				break;
			}
		}
		public static void cartasEspañolas()
		{
			int palo, carta;
			boolean generar = true;
			Scanner input = new Scanner(System.in);
			Random r = new Random();
			do
			{
				palo = r.nextInt(3);
				carta = r.nextInt(9);
				System.out.print("Se ha generado una carta de:");
				palo(palo,true);
				cartaEspañola(carta);
				System.out.println("\n Dese generar otra carta¿?true or false");
				generar = input.nextBoolean();
			}while (generar);
			input.close();
		}

		/*
		 * Dadas dos fechas, mostrar el número de días que hay de diferencia. 
		 * Para una mayor comodidad, supondremos que todos los meses tienen 30 días.
		 * @author Fco.Javier Cano
		 */
		public static void diferenciaFechas(String _fecha1,String _fecha2)
		{
			boolean dateError = _fecha1.length() != _fecha2.length(); 
			if (!dateError)
			{
				int days1 = Integer.valueOf(_fecha1.substring(0,2));
				int days2 = Integer.valueOf(_fecha2.substring(0,2));
				
				int month1 = Integer.valueOf(_fecha1.substring(3,5));
				int month2 = Integer.valueOf(_fecha2.substring(3,5));
				
				int year1 = Integer.valueOf(_fecha1.substring(6,_fecha1.length()));
				int year2 = Integer.valueOf(_fecha2.substring(6,_fecha1.length()));
				
				dateError = days1 > 30 || days2 > 30
							|| month1 > 12 || month2 > 12
							|| year1 < 0 || year2 < 0
							|| year1 > 2019 || year2 > 2019;
							
				if (!dateError)
				{
					System.out.println("La diferencia de días entre ambas fechas es: "
							+(Math.abs(year1-year2)*12*30
							+Math.abs(month1-month2)*30
							+Math.abs(days1-days2)
							));
				}
			}

			if(dateError)
			{
				System.out.println("Error formato en el formato de la fecha, revise los valores, recuerda: DD/MM/YYYY");
			}

		}
		/*
		 * Realizar un programa que muestre el producto de los N primeros números impares.
		 * @author Fco.Javier Cano
		 */
		public static void productoNImpares(int _N)
		{
			int contador = 0;
			int i = 1;
			int producto = 1;
			while (contador < _N)
			{
				++i;
				if (i % 2 != 0)
				{
					producto *= i;
					++contador;
				}
			}
			System.out.println("El producto de los "+_N+" primeros números impares es "+producto);
		}

		/*
		 *Diseña una aplicación que muestre las tablas de multiplicar del 1 al 10.
		 * @author Fco.Javier Cano
		 */
		public static void tablasMultiplicar()
		{
			for (int i = 1; i <= 10; ++i) 
			{
				for (int j = 0; j <= 10; ++j) 
				{
					System.out.println(i+"x"+j+" = "+ i*j);
				}
			}
		}
		/*
		 * Dada una cadena, devolver la mitad de esta.
		 * @author Fco.Javier Cano
		 */
		public static String mitad(String _input)
		{
			return (_input.length() <= 0 )? "":_input.substring(_input.length()/2,_input.length()-1);
		}
		//	23)	Modificar el programa anterior para que nos permita elegir si queremos obtener la mitad izquierda o derecha.
		/*
		 * 3.	Realiza un programa que, dado un año, diga si es bisiesto. 
		 * Un año es bisiesto si es múltiplo de 4, exceptuando los múltiplos de 100,
		 * que solo son bisiestos cuando son múltiplos además de 400.
		 * @author Fco.Javier Cano
		 */
		public static String mitadLado(String _input, boolean _izquierda)
		{
			int inicio,fin;
			String aux = "";
			if (_input.length()>0) 
			{
				if (_izquierda)
				{
					inicio = 0;
					fin = _input.length()/2;
				} else
				{
					inicio = _input.length()/2;
					fin = _input.length()-1;
				}
				_input.substring(inicio,fin);
			}

			return aux;
		}
		/*
		 * Dada una cadena, reemplaza todas las letras a por una e 
		 * y devuelve cuantas has letras has reemplazado.
		 * @author Fco.Javier Cano
		 */
		public static int reemplazarA(String _input)
		{
			int cantReempl = 0;
			_input = _input.replaceAll("[aA]", "e");
			for (int i = 0; i < _input.length(); ++i)
			{
				if (_input.charAt(i) == 'e')
				{
					++cantReempl;
				}
				
			}
			return cantReempl;
		}

		/*
		 * Realiza una calculadora que nos pida dos operandos enteros y un signo matemático. 
		 * Tras realizar la operación indicada, nos deberá mostrar el resultado. Las operaciones soportadas son: +, -, *, /, ^ (potencia, primer operando base y segundo exponente) y %.
		 * @author Fco.Javier Cano
		 */
		public static void calculadora()
		{
			Scanner input = new Scanner(System.in);
			System.out.print("Introduzca un signo matemático (+, -, *, /, ^): ");
			String codOp = input.nextLine();
			System.out.print("\nIntroduzca un operando: ");
			int a = input.nextInt();
			System.out.print("\nIntroduzca un operando: ");
			int b = input.nextInt();
			switch (codOp)
			{
				case "+":
					System.out.println("Suma de "+a+" + "+b+" = "+(a+b));
				break;
				case "-":
					System.out.println("Resta de "+a+" - "+b+" = "+(a-b));
					break;
				case "*":
					System.out.println("Multiplicación de "+a+" y "+b+" = "+(a*b));
					break;
				case "/":
					System.out.println("División de "+a+" con "+b+" = "+(a/(b>0?b:1)));
					break;
				case "^":
					System.out.println("Potencia de "+a+" y "+b+" = "+Math.pow(a, b));
					break;
				default:
						System.out.println("Error");
				break;
			}
			input.close();
		}
	}



	}

}
