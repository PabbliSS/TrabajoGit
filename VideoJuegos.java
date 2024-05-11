import java.util.Scanner;
import java.util.Random;

public class VideoJuegos {


    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);


        System.out.print("\r\n" + //
                "█▀█|█▀█|█▀▀|█▀|█▀| |▄█| |▀█▀|█▀█| |█|█▄░█|█▀|█▀▀|█▀█|▀█▀| |█▀▀|█▀█|█|█▄░█\r\n" + //
                "█▀▀|█▀▄|██▄|▄█|▄█| |░█| |░█░|█▄█| |█|█░▀█|▄█|██▄|█▀▄|░█░| |█▄▄|█▄█|█|█░▀█");

        System.out.print("\n \r\n" + //
                "▄▀ ▒█▀▀█ ▀▄ \r\n" + //
                "█░ ▒█░░░ ░█ \r\n" + //
                "▀▄ ▒█▄▄█ ▄▀ \n");

        boolean jugar = false;


        do {

            int monedas = 0;

            System.out.println("\n");

            System.out.print("\n \r\n" + //
                    "█▀▀|█▀█|█|█▄░█| ▀\r\n" + //
                    "█▄▄|█▄█|█|█░▀█| ▄ ");

            String coin = sc.next();



            if (coin.equalsIgnoreCase("1")) {


                monedas = monedas + 1;


            } else {


                System.out.println("Tecla No Valida");


            }

            System.out.println("\n");

            System.out.print("\r\n" + //
                    "█▀█ █▀█ █▀▀ █▀ █▀   ▀ █▀ ▀   ▀█▀ █▀█   █▀ ▀█▀ ▄▀█ █▀█ ▀█▀   ▀\r\n" + //
                    "█▀▀ █▀▄ ██▄ ▄█ ▄█   ░ ▄█ ░   ░█░ █▄█  ▄█░  █░ █▀█ █▀▄ ░█░   ▄");



            String tecla = sc.next();

            if (monedas == 1 && tecla.equalsIgnoreCase("S")) {


                jugar = true;
                presentacion();


            } else if (monedas >= 1 && !tecla.equals("S")) {


                System.out.println("Debes pulsar la tecla S para poder jugar");
                jugar = false;


            } else if (monedas <= 0) {


                System.out.println("No hay créditos para jugar. Por favor, inserta una moneda.");
                jugar = false;


            }


        } while (!jugar);

    }


    public static void presentacion() {

        Scanner sc = new Scanner(System.in);


        System.out.println("\n");


        System.out.println("╔═══╗╔╗──\r\n" + //
                           "║╔══╝║║──\r\n" + //
                           "║╚══╗║║──\r\n" + //
                           "║╔══╝║║──\r\n" + //
                           "║╚══╗║╚═╗\r\n" + //
                           "╚═══╝╚══╝\r\n" + //
                           "");
            
        System.out.println("╔══╗╔══╗╔╗─╔╗╔══╗╔╗╔╗╔═══╗╔══╗╔══╗╔╗──╔╗──╔══╗\r\n" + //
                           "║╔═╝║╔╗║║╚═╝║║╔═╝║║║║║╔═╗║║╔═╝╚╗╔╝║║──║║──║╔╗║\r\n" + //
                           "║║──║║║║║╔╗─║║║──║║║║║╚═╝║║╚═╗─║║─║║──║║──║║║║\r\n" + //
                           "║║──║║║║║║╚╗║║║──║║║║║╔╗╔╝╚═╗║─║║─║║──║║──║║║║\r\n" + //
                           "║╚═╗║╚╝║║║─║║║╚═╗║╚╝║║║║║─╔═╝║╔╝╚╗║╚═╗║╚═╗║╚╝║\r\n" + //
                           "╚══╝╚══╝╚╝─╚╝╚══╝╚══╝╚╝╚╝─╚══╝╚══╝╚══╝╚══╝╚══╝\r\n" + //
                           "");

        System.out.println("╔══╗─╔═══╗\r\n" + //
                           "║╔╗╚╗║╔══╝\r\n" + //
                           "║║╚╗║║╚══╗\r\n" + //
                           "║║─║║║╔══╝\r\n" + //
                           "║╚═╝║║╚══╗\r\n" + //
                           "╚═══╝╚═══╝\r\n" + //
                           "");

        System.out.println("╔═══╗╔══╗╔══╗─╔╗──╔══╗╔╗──╔╗──╔══╗\r\n" + //
                           "║╔═╗║║╔╗║║╔╗║─║║──╚╗╔╝║║──║║──║╔╗║\r\n" + //
                           "║╚═╝║║╚╝║║╚╝╚╗║║───║║─║║──║║──║║║║\r\n" + //
                           "║╔══╝║╔╗║║╔═╗║║║───║║─║║──║║──║║║║\r\n" + //
                           "║║───║║║║║╚═╝║║╚═╗╔╝╚╗║╚═╗║╚═╗║╚╝║\r\n" + //
                           "╚╝───╚╝╚╝╚═══╝╚══╝╚══╝╚══╝╚══╝╚══╝\r\n" + //
                           "");

                
        System.out.println("\n");
                        

        System.out.print("INSERT YOUR NAME: ");
        String nombre = sc.next();

        System.out.println("Muy buenas " + nombre + ", encantado de conocerte, me llamo Pablo S.S., pero puedes llamarme Pablillo."
                + "\n Te quiero dar la bienvenida a este maravilloso juego de sabiduría y experiencia, en el cual puedes ganar mucho dinero, pero para eso debes superar todas y cada una de las 15 preguntas que se te van a plantear, unas más difíciles y otras menos difíciles"
                + "\n He de decirte que cada vez que respondas una pregunta, se comprobará el resultado, y si es correcta se irá sumando una cantidad de dinero, en concreto esta cantidad irá desde 0€ hasta el 1.000.000€."
                + "\n ¡¡¡ ESPERO QUE DISFRUTES Y MUCHA SUERTE EN ESTA GRAN AVENTURA !!!"
                + "\n ¡¡¡ A POR EL MILLÓN !!!\n");

        boolean acceso = false;

        do {


            System.out.println("\nPulsa 'C' para continuar.");
            String cont = sc.next();

            if (cont.equalsIgnoreCase("C")) {

                juegoP1();
                acceso = true;
                System.out.println("\n");

            } else if (!cont.equalsIgnoreCase("C")) {

                System.out.println("Tecla incorrecta");
                acceso = false;

            }

        } while (!acceso);

    }

    public static void juegoP1() {


        Scanner sc = new Scanner(System.in);

        Pregunta[] preguntas = new Pregunta[51];



        preguntas[0] = new Pregunta("¿Cuál es el único jugador de la historia del fútbol en ser galardonado con el 'Superbalón de Oro'?",
                new String[]{"A. Alfredo Di Estéfano", "B. Diego Maradona", "C. Pelé", "D. Beckenbauer"}, 0);






        preguntas[1] = new Pregunta("¿Cuánto es 2 elevado a 16?",
                new String[]{"A. 65.536", "B. 45.256", "C. 64.321", "D. 68.354"}, 0);






        preguntas[2] = new Pregunta("¿En qué año se fundó Google?",
                new String[]{"A. 1995", "B. 2000", "C. 2005", "D. 1998"}, 3);





        
        preguntas[3] = new Pregunta("¿Qué significan las '3R's?",
                new String[]{"A. Reducir, reutilizar y reciclar", "B. Reducir, recoger y reutilizar", "C. Reciclar, reducir y revisar", "D. Reducir, revisar y recoger"}, 0);




    

        preguntas[4] = new Pregunta("El aguacate es...",
                new String[]{"A. Una fruta", "B. Una verdura", "C. Una hortaliza", "D. Un tuberculo"}, 0);





    
        preguntas[5] = new Pregunta("¿En qué ciudad están la Catedral de San Marcos, el Palacio del Dux y el Puente de Rialto?",
                new String[]{"A. Milán", "B. Florencia", "C. Génova", "D. Venecia"}, 3);





    
        preguntas[6] = new Pregunta("¿Dónde se encuentran las minas de Potosi?",
                new String[]{"A. España", "B. Chile", "C. Bolivia", "D. Rusia"}, 2);


    



        preguntas[7] = new Pregunta("¿En qué pais sudamericano esta la ciudad y provincia de La Rioja?",
                new String[]{"A. Paraguay", "B. Argentina", "C. Colombia", "D. Guatemala"}, 1);





        preguntas[8] = new Pregunta("¿En qué parte de Estados Unidos se encuentra el Cañón del Colorado?",
                new String[]{"A. Arizona", "B. Texas", "C. Wisconsin", "D. Washington"}, 0);






        preguntas[9] = new Pregunta("¿Cuál es la única provincia andaluza que tiene frontera con Portugal?",
                new String[]{"A. Jaén", "B. Cádiz", "C. Huelva", "D. Cáceres"}, 2);





              
        preguntas[10] = new Pregunta("¿De qué país forma parte hoy la isla de Córcega, bautizada por los griegos como 'la más bonita' ?",
                new String[]{"A. Italia", "B. Francia", "C. Grecia", "D. Malta"}, 1);

    



    
        preguntas[11] = new Pregunta("¿Cómo se llama la ciudadela de Moscú?",
                new String[]{"A. Pentágono", "B. Kremlin", "C. Tiananmen", "D. Bam"}, 1);






        preguntas[12] = new Pregunta("¿Cuál es la cordillera más larga del planeta?",
                new String[]{"A. Andes", "B. Himalaya", "C. Montañas Rocosas", "D. Alpes"}, 0);






        preguntas[13] = new Pregunta("¿Cuál de ellos es conocido como 'el país de los mil lagos'?",
                new String[]{"A. Canadá", "B. Finlandia", "C. Brasil", "D. Noruega"}, 1);


    


                
        preguntas[14] = new Pregunta("¿De qué país es capital 'Bucarest'?",
                new String[]{"A. Rumania", "B. Dinamarca", "C. Alemania", "D. Finlandia"}, 0);





    
        preguntas[15] = new Pregunta("¿En que año se fundó la Organización de las Naciones Unidas (ONU)?",
                new String[]{"A. 1942", "B. 1945", "C. 1951", "D. 1960"}, 1);





    
        preguntas[16] = new Pregunta("¿Cuál de los siguientes elementos no es un gas noble?",
                new String[]{"A. Helio", "B. Neón", "C. Cloro", "D. Kriptón"}, 2);




    

        preguntas[17] = new Pregunta("¿Cuál es el autor de la novela 'Cien años de soledad'?",
                new String[]{"A. Mario Vargas Llosa", "B. Gabriel Garciá Márquez", "C. Isabel Allende", "D. Julio Cortázar"}, 1);


                



        preguntas[18] = new Pregunta("¿En que año se llevó a cabo la Revolución Rusa?",
                new String[]{"A. 1905", "B. 1917", "C. 1923", "D. 1931"}, 1); 





          
        preguntas[19] = new Pregunta("¿Cuál es la capital de Mongolia?",
                new String[]{"A. Ulaanbaatar", "B. Astana", "C. Katmandú", "D. Timphu"}, 0);






        preguntas[20] = new Pregunta("¿Cuál es el elemento más abundante en la corteza terrestre?",
                new String[]{"A. Hierro", "B. Oxígeno", "C. Silicio", "D. Aluminio"}, 2);






        preguntas[21] = new Pregunta("¿Quién fue el presidente de Estados Unidos durante la Guerra Civil?",
                new String[]{"A. Abraham Lincoln", "B. Thomas Jefferson", "C. Andrew Jackson", "D. George Washington"}, 0);






        preguntas[22] = new Pregunta("¿Cuál es la fórmula química del ácido sulfúrico?",
                new String[]{"A. HCI", "B. H2SO4", "C. NaOH", "D. CO2"}, 1);






        preguntas[23] = new Pregunta("¿Qué escritor argentino recibió el Premio Nobel de Literatura en 2010?",
                new String[]{"A. Julio Cortázar", "B. Jorge Luis Borges", "C. Ernesto Sabato", "D. Adolfo Bioy Casares"}, 2);







        preguntas[24] = new Pregunta("¿En qué año se lanzó el primer satélite artificial Sputnik 1?",
                new String[]{"A. 1952", "B. 1957", "C. 1961", "D. 1969"}, 1);






        preguntas[25] = new Pregunta("¿Qué general dirigió el desembarco de Normandía?",
                new String[]{"A. Bernard Montgomery", "B. Harold Alexander", "C. Charles de Gaulle", "D. Erwin Rommel"}, 0);

        




        preguntas[26] = new Pregunta("¿Qué insecto tiene 15.000 papilas gustativas repartidas en sus patas?",
                new String[]{"A. Mariposa", "B. Mosca", "C. Escarabajo", "D. Tábano"}, 1);






        preguntas[27] = new Pregunta("¿Qué jugador de baloncesto español ha ganado más medallas jugando con la selección?",
                new String[]{"A. Nacho Solozábal", "B. Pau Gasol", "C. Carlos Jiménez", "D. Juan Antonio 'Epi' "}, 2);






        preguntas[28] = new Pregunta("¿Cuál es la capital europea del vals?",
                new String[]{"A. Copenhague", "B. Düsseldorf", "C. Viena", "D. Helsinki"}, 2);






        preguntas[29] = new Pregunta("¿Con qué confunde Do Quijote una bacía de barbero?",
                new String[]{"A. Molinos de viento", "B. Yelmo de Mambrino", "C. Bálsamo de Fierabrás", "D. Espada de Amadís de Grecia"},1);






        preguntas[30] = new Pregunta("¿Cuál es la capital europea del vals?",
                new String[]{"A. Copenhague", "B. Düsseldorf", "C. Viena", "D. Helsinki"}, 2);





            
        preguntas[31] = new Pregunta("¿Cuál es el rio mas largo del mundo?",
                new String[]{"A. Amazonas", "B. Nilo", "C. Yangtsé", "D. Misisipi"}, 1);






        preguntas[32] = new Pregunta("¿Cuál es la capital de Australia?",
                new String[]{"A. Canberra", "B. Sídney", "C. Melbourne", "D. Brisbane"}, 0);






        preguntas[33] = new Pregunta("¿Cuál es la edad de Cristo?",
                new String[]{"A. 33", "B. 30", "C. 24", "D. 35"}, 0);






        preguntas[34] = new Pregunta("¿Cuántos continentes hay en el mundo?",
                new String[]{"A. 5", "B. 6", "C. 7", "D. 8"}, 2);






        preguntas[35] = new Pregunta("¿Cuántas estrellas tiene la bandera de Estados Unidos?",
                new String[]{"A. 48", "B. 50", "C. 52", "D. 54"}, 1);






        preguntas[36] = new Pregunta("¿Cuál es el pais mas grande del mundo por territorio?",
                new String[]{"A. Canadá", "B. Estados Unidos", "C. China", "D. Rusia"}, 3);






        preguntas[37] = new Pregunta("¿Quién fue el pintor del famoso cuadro 'La Noche Estrellada'?",
                new String[]{"A. Leonardo da Vinci", "B. Vincent van Gogh", "C. Pablo Picasso", "D. Claude Monet"}, 1);






        preguntas[38] = new Pregunta("¿Qué espacio de televisión fue el más seguido en el año 2006 en España?",
                new String[]{"A. Tómbola", "B. Aquí hay tomate", "C. Liga de Campeones", "D. Días de cine"}, 2);





        
        preguntas[39] = new Pregunta("¿Cúal de estas palabras hace referencia a un mineral?",
                new String[]{"A. Malaquita", "B. Clementina", "C. Tirita", "D. Anémona"}, 0);






        preguntas[40] = new Pregunta("¿Qué parte de la ciencia estudia los tumores?",
                new String[]{"A. Oncologia", "B. Pediatria", "C. Tumorologia", "D. Radiologia"}, 0);
        





        preguntas[41] = new Pregunta("¿Qué pais estuvo dividido por el 'telón de acero'?",
                new String[]{"A. Francia", "B. Alemania", "C. Rusia", "D. Portugal"}, 1);






        preguntas[42] = new Pregunta("¿Quién protagonizó la pelicula española de Almodóvar 'Kika' ?",
                new String[]{"A. Veronica Forqué", "B. Carmen Maura", "C. Victoria Abril", "D. Maribel Verdú"}, 0);
        





        preguntas[43] = new Pregunta("¿La intensidad de qué se mide en fones?",
                new String[]{"A. Del sonido", "B. Del color", "C. De una onda", "D. De la voz"}, 0);






        preguntas[44] = new Pregunta("¿Cuál de las siguientes cantantes destaca o ha destacado en copla?",
                new String[]{"A. Lola Flores", "B. Ana Belén", "C. Marta Sánchez", "D. Maria Callas"}, 0);






        preguntas[45] = new Pregunta("¿En qué ciudad se encuentra el cuadro de El Greco 'El entierro del Conde de Orgaz'?",
                new String[]{"A. Salamanca", "B. Ávila", "C. Toledo", "D. Zamora"}, 2);






        preguntas[46] = new Pregunta("¿Cuál es el estilo de la 'Torre del gallo' situada en la Catedral Vieja de Salamanca?",
                new String[]{"A. Gótica", "B. Plateresca", "C. Romántica", "D. Barroca"}, 2);






        preguntas[47] = new Pregunta("¿Dónde nació Sócrates?",
                new String[]{"A. Italia", "B. Cártago", "C. Grecia", "D. Palestina"}, 2);






        preguntas[48] = new Pregunta("¿A qué sector pertenece la empresa 'Continental'?",
                new String[]{"A. Transportes", "B. Construcción", "C. Comunicación", "D. Electricidad"}, 0);






        preguntas[49] = new Pregunta("¿En qué parte del cuerpo está el yunque?",
                new String[]{"A. En el pie", "B. En la nariz", "C. En el codo", "D. En el oido"}, 3);






        preguntas[50] = new Pregunta("¿Cuántos dias tiene el mes de julio?",
                new String[]{"A. 30 dias", "B. 28 dias", "C. 31 dias", "D. 29 dias"}, 2);


  

  
                
        

                JuegoPreguntas juego = new JuegoPreguntas(preguntas);

               
                        
                

                Random random = new Random();
                int totalPreguntas = 51;
                int preguntasSeleccionadas = 10;
                int[] preguntasIndices = new int[preguntasSeleccionadas];
        



                for (int i = 0; i < preguntasSeleccionadas; i++) {


                    int preguntaIndex;


                    do {

                        preguntaIndex = random.nextInt(totalPreguntas);

                    } while (yaSeleccionada(preguntasIndices, i, preguntaIndex));

                    preguntasIndices[i] = preguntaIndex;


                }


        
                Pregunta[] preguntasSeleccionadasArray = new Pregunta[preguntasSeleccionadas];


                for (int i = 0; i < preguntasSeleccionadas; i++) {

                    preguntasSeleccionadasArray[i] = preguntas[preguntasIndices[i]];

                }
        
                int comodinesDisponibles = 3;
                boolean continuar = true;
                int dinero = 0;
                int respuestasCorrectas = 0;
                int respuestasIncorrectas = 0;



                do {


                for (Pregunta pregunta : preguntasSeleccionadasArray) {


                    mostrarPregunta(pregunta);
                    String respuestaUsuario = sc.next().toUpperCase();
        
                    dinero = 0;

                    if (respuestaUsuario.equalsIgnoreCase("Plantarse")) {



                                System.out.println("\nVaya, has decidido plantarte. Has tomado esta decision despues de pensarlo bien," + 
                                                "por lo que te llevas a casa la mitad del dinero acumulado durante el juego."+
                                                "Esperamos que te hayas divertido y que uses el dinero de manera correcta." +
                                                "\n¡MUCHAS GRACIAS, Y HASTA LA PROXIMA!");
                                
                                double dineroplant = (dinero/2);

                                System.out.println("DINERO GANADO : " + dineroplant);

                                continuar = false;

                        
                    } else if (respuestaUsuario.equalsIgnoreCase("COMODIN")) {


                        if (comodinesDisponibles > 0) {

                                System.out.println("\nSelecciona entre lo siguientes comodines:\n");
                                
                                System.out.println("1. Comodin de la Llamada");
                                System.out.println("2. Comodin del Mundo Web");
                                System.out.println("3. Comodin del Publico");

                                System.out.print("\nEscoge una opcion para el comodin: ");
                                int comodin = sc.nextInt();

                                
                                if (comodin == 1) {

                                        System.out.println("Has decidido usar el Comodin de la Llamada."+
                                                           "¡Perfecto!. Ahora podras hacer uso de tu telefono para llamar a una persona de tus contactos" +
                                                           "que creas que te puedo ayudar a resolver la pregunta, asi que piensalo bien." +
                                                           "¡MUCHA SUERTE!\n");
                                
                                        usarComodin(preguntas, pregunta);

                                        comodinesDisponibles--;                   


                                        
                                } else if (comodin == 2) {


                                        System.out.println("Has decidido usar el Comodin del Mundo Web."+
                                                           "¡Perfecto!. Ahora podras hacer uso de Internet para buscar la posible solucion para esta pregunta, asi que busca bien." +
                                                           "¡MUCHA SUERTE!\n");
             

                                        usarComodin(preguntas, pregunta);

                                        comodinesDisponibles--;     


                                } else if (comodin == 3){


                                        System.out.println("Has decidido usar el Comodin del Publico."+
                                                           "¡Perfecto!. Ahora podras elegir a una persona de tu alrededor para que te ayuda a buscar una posible solucion a esta pregunta que se te plantea," +
                                                           "asi que decide bien." +
                                                           "¡MUCHA SUERTE!\n");

             
                                        usarComodin(preguntas, pregunta);

                                        comodinesDisponibles--;     

                                }


                        } else {


                            System.out.println("Ya no tienes comodines disponibles. Responde la pregunta.");


                        }

                    } else {

                        if (verificarRespuesta(pregunta, respuestaUsuario)) {


                            System.out.println("Y la respuesta es...");
                            boolean corr = false;

        
                            do {


                                System.out.println("Pulsa 'V' para ver...");
                                String respcorr = sc.next();

        
                                if (respcorr.equalsIgnoreCase("V")) {


                                    corr = true;
                                    System.out.println("¡ CORRECTA :-) !\n");
                                    dinero = dinero + 100000;
                                    respuestasCorrectas++;
                                    System.out.println(" _____________________\n" + "|                     |\n" + "|       " + dinero + "€"
                                            + "\t      |\n" + "|_____________________|\n");
                               
                               
                                } else {


                                    System.out.println("Tecla incorrecta, Tecleela de nuevo.");
                                    corr = false;


                                }



                            } while (!corr);


        
                        } else {

                            boolean incorr = false;
        

                            do {

                                System.out.println("Pulsa 'V' para ver...");
                                String respcorr = sc.next();
        
                                if (respcorr.equalsIgnoreCase("V")) {


                                    incorr = true;
                                    System.out.println("¡ INCORRECTA :-( !\n");
                                    continuar = false;
                                    respuestasIncorrectas++;

                                    
                                } else {

                                    System.out.println("Tecla incorrecta, Tecleela de nuevo.");
                                    incorr = false;

                                }
        
                            } while (!incorr);


                        }


                    }


                }



        } while (continuar = true);
        

                System.out.println("¡Juego terminado!");

                
                System.out.println("¡Juego terminado!");
                System.out.println("Respuestas Correctas: " + respuestasCorrectas);
                System.out.println("Respuestas Incorrectas: " + respuestasIncorrectas);

                int boteacumulado = (respuestasCorrectas * 100000) - (respuestasIncorrectas * 100000);

                System.out.println("El bote acumulado es el siguiente: " + boteacumulado + " de euros.");



        }

      

            private static void usarComodin(Pregunta[] preguntas, Pregunta pregunta) {

        
                Scanner sc = new Scanner(System.in);

                System.out.println("Has usado un comodín. La pregunta es la siguiente:");

                mostrarPregunta(pregunta);
            
                System.out.println("Ingresa tu respuesta (A-D):");
                String respuestaUsuario = sc.next().toUpperCase();
            
          
                while (!respuestaUsuario.matches("[A-D]")) {


                    System.out.println("Respuesta no válida. Ingresa una opción válida (A-D):");
                    respuestaUsuario = sc.next().toUpperCase();


                }


                int dinero = 0;


                if (verificarRespuesta(pregunta, respuestaUsuario)) {


                        System.out.println("Y la respuesta es...");
                        boolean corr = false;

    
                        do {


                            System.out.println("Pulsa 'V' para ver...");
                            String respcorr = sc.next();
    
                            if (respcorr.equalsIgnoreCase("V")) {


                                corr = true;
                                System.out.println("¡ CORRECTA :-) !\n");
                                dinero = dinero + 100000;
                                System.out.println(" _____________________\n" + "|                     |\n" + "|       " + dinero + "€"
                                        + "\t      |\n" + "|_____________________|\n");


                            } else {


                                System.out.println("Tecla incorrecta, Tecleela de nuevo.");
                                corr = false;

                            }


                        } while (!corr);

    
                    } else {


                        boolean incorr = false;
    
                        do {


                            System.out.println("Pulsa 'V' para ver...");
                            String respcorr = sc.next();

    
                            if (respcorr.equalsIgnoreCase("V")) {


                                incorr = true;
                                System.out.println("¡ INCORRECTA :-( !\n");
                                

                            } else {


                                System.out.println("Tecla incorrecta, Tecleela de nuevo.");
                                incorr = false;


                            }
    

                        } while (!incorr);

    
                        System.out.println("Incorrecto. La respuesta correcta era la opción " + (pregunta.respuestaCorrecta + 1) + ".\n");



                    }        
 
            }
        
        
            private static boolean yaSeleccionada(int[] preguntasIndices, int index, int preguntaIndex) {


                for (int i = 0; i < index; i++) {


                    if (preguntasIndices[i] == preguntaIndex) {


                        return true;


                    }

                }


                return false;


            }


        
            private static void mostrarPregunta(Pregunta pregunta) {


                System.out.println(pregunta.enunciado);
        
                for (int i = 0; i < pregunta.opciones.length; i++) {

                        
                    System.out.println((char) ('A' + i) + ". " + pregunta.opciones[i]);


                }

        
                System.out.print("Elige una opción (A-D): ");


            }
        
            private static boolean verificarRespuesta(Pregunta pregunta, String respuestaUsuario) {


                int opcionSeleccionada = respuestaUsuario.charAt(0) - 'A';
                return opcionSeleccionada == pregunta.respuestaCorrecta;


            }


        }
        


        class Pregunta {


            String enunciado;
            String[] opciones;
            int respuestaCorrecta;
        
            public Pregunta(String enunciado, String[] opciones, int respuestaCorrecta) {



                this.enunciado = enunciado;
                this.opciones = opciones;
                this.respuestaCorrecta = respuestaCorrecta;


            }


        }


        
        class JuegoPreguntas {


            Pregunta[] preguntas;
        
            public JuegoPreguntas(Pregunta[] preguntas) {


                this.preguntas = preguntas;


            }


        }