package Frame;

import AppPackage.AnimationClass;
import java.awt.Panel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Pastor Erwin
 */
public class Pecado extends javax.swing.JFrame {

    /**
     * Creates new form Pecado
     */
    public Pecado() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        JLinfo(1);
        visor();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JTema = new javax.swing.JTextField();
        JLCarrusel = new javax.swing.JLabel();
        JLHome = new javax.swing.JLabel();
        JButtonDer = new javax.swing.JButton();
        JButtonIzqui = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JLTexAreaInfo = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PECADO");
        setMinimumSize(new java.awt.Dimension(1070, 610));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTema.setEditable(false);
        JTema.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        JTema.setForeground(new java.awt.Color(204, 0, 0));
        JTema.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTema.setBorder(null);
        JTema.setOpaque(false);
        jPanel1.add(JTema, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 420, 30));

        JLCarrusel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(JLCarrusel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 670, 360));

        JLHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/home.png"))); // NOI18N
        JLHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JLHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLHomeMouseClicked(evt);
            }
        });
        jPanel1.add(JLHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 20, -1, 30));

        JButtonDer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/OneWay/dos-flechas-a-la-derecha.png"))); // NOI18N
        JButtonDer.setBorder(null);
        JButtonDer.setBorderPainted(false);
        JButtonDer.setContentAreaFilled(false);
        JButtonDer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonDer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonDerActionPerformed(evt);
            }
        });
        jPanel1.add(JButtonDer, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 190, 32, 32));

        JButtonIzqui.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/OneWay/dos-flechas-a-la-izquierda.png"))); // NOI18N
        JButtonIzqui.setBorder(null);
        JButtonIzqui.setBorderPainted(false);
        JButtonIzqui.setContentAreaFilled(false);
        JButtonIzqui.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonIzqui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonIzquiActionPerformed(evt);
            }
        });
        jPanel1.add(JButtonIzqui, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 32, 32));

        JLTexAreaInfo.setEditable(false);
        JLTexAreaInfo.setBackground(new java.awt.Color(0, 0, 0));
        JLTexAreaInfo.setColumns(20);
        JLTexAreaInfo.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        JLTexAreaInfo.setForeground(new java.awt.Color(255, 255, 255));
        JLTexAreaInfo.setLineWrap(true);
        JLTexAreaInfo.setRows(5);
        JLTexAreaInfo.setText("\n");
        JLTexAreaInfo.setBorder(null);
        jScrollPane1.setViewportView(JLTexAreaInfo);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 1100, 230));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1099, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private ImageIcon galeria[] = new ImageIcon[5];
    private int contador = 1;

    public void JLinfo(int x) {

        if (x == 1) {

            JTema.setText("¿QUE ES EL PECADO?");
            JLTexAreaInfo.setText("El significado original (etimológico) de la palabra pecado es \"errar el blanco\".\n"
                    + "Esto quiere decir que cuando pecamos no acertamos o nos desviamos de lo que hubiera sido correcto hacer. Todos\n"
                    + "podemos recordar momentos en los que hemos dicho o hecho algo errado, algo de lo cual nos hemos arrepentido\n "
                    + "después. Pero cuando la Biblia habla sobre el pecado habla de algo más profundo que eso, algo que trae\n"
                    + "consecuencias eternas..\n\n"
                    + "¿Cómo define el pecado la Biblia ?\n"
                    + "\n"
                    + "El concepto de pecado en la Biblia se refiere a quebrantar o transgredir la ley de Dios.\n"
                    + "En 1 Juan 3:4 leemos:Todo aquel que comete pecado, infringe también la ley; pues el pecado es infracción\n"
                    + "de la ley. Cuando desobedecemos a Dios ignorando su ley, lo hacemos (consciente o inconscientemente)\n"
                    + "guiados por una actitud rebelde. La base del pecado esta en la rebeldía contra Dios y sus mandatos.\n"
                    + "El corazón rebelde es en realidad uno orgulloso. Quiere probar que sabe más que Dios\n"
                    + "que puede solucionar las cosas a su manera y por sus propias fuerzas.\n"
                    + "\n\n"
                    + "Y es precisamente así, con esa actitud de rebeldía, que comenzó todo ...\n\n"
                    + "¿Cómo entró el pecado al mundo?\n"
                    + "Cuando Dios creó al hombre, lo puso en el jardín del Edén y le encargó que lo cultivara y lo cuidara. \n "
                    + "Sin embargo, le dio una orden muy clara: Puedes comer de todos los árboles del jardín, pero del árbol del\n"
                    + "conocimiento del bien y del mal no deberás comer. El día que de él comas, ciertamente morirás.\n"
                    + "\n"
                    + "(Génesis 2:16b-17). El hombre podía comer de todos los árboles del jardín del Edén menos uno: \n"
                    + "el árbol del conocimiento del bien y del mal. \n"
                    + "Y fue precisamente de esa prohibición que se valió la serpiente (el diablo) para tentar al hombre y a la mujer. \n"
                    + "Encontramos el relato en Génesis 3:1-5.\n"
                    + "\n"
                    + "La serpiente era más astuta que todos los animales del campo que Dios el Señor había hecho, \n"
                    + "así que le preguntó a la mujer: —¿Es verdad que Dios les dijo que no comieran de ningún árbol del jardín?\n"
                    + "—Podemos comer del fruto de todos los árboles —respondió la mujer—. \n"
                    + "Pero, en cuanto al fruto del árbol que está en medio del jardín, \n"
                    + "Dios nos ha dicho: “No coman de ese árbol, ni lo toquen; de lo contrario, morirán”.\n"
                    + "Pero la serpiente le dijo a la mujer: —¡No es cierto, no van a morir! Dios sabe muy bien que, \n"
                    + "cuando coman de ese árbol, se les abrirán los ojos y llegarán a ser como Dios, conocedores del bien y del mal.\n"
                    + "(Génesis 3:1-5).\n"
                    + "\n"
                    + "Aquí vemos claramente la forma en la que el diablo ha obrado desde el principio en su intento por engañar a los \n"
                    + "seres humanos. Primero, habló a solas con Eva. Esperó un momento en el que Adán no estaba presente y \n"
                    + "aprovechó un momento de aparente vulnerabilidad.Luego vemos que actuó con astucia, con conocimiento, creó \n"
                    + "dudas y apeló al deseo de poder y de grandeza.\n\n"
                    + "Con astucia: La serpiente fue hábil para engañar con cautela y delicadeza. \n"
                    + "Comienza con una pregunta de la cual ya sabía la respuesta. \n"
                    + "Habla con Eva como si fueran amigas conversando sobre algo rutinario.\n"
                    + "Con conocimiento: La serpiente conocía la prohibición de Dios y las consecuencias que traería la desobediencia. \n"
                    + "Se había informado bien y presentó su argumento de forma engañosa, pero con firmeza.\n"
                    + "Creó dudas en el corazón de Eva y básicamente llamó a Dios mentiroso. La engañó al tergiversar el significado\n"
                    + "de la palabra muerte. No explicó que la desobediencia traería como consecuencia la muerte espiritual, separación\n"
                    + "entre el hombre y Dios. Apeló al deseo de poder y de grandeza que había en el corazón de Eva.\n"
                    + "Le dijo: «llegarán a ser como Dios, conocedores del bien y del mal.» \n\n"
                    + "Tristemente, primero Eva y después Adán, escogieron desobedecer a Dios y hacerle caso a la serpiente (el diablo). \n"
                    + "Este acto marcó la ruptura de la amistad especial que ellos habían disfrutado con Dios hasta ese momento. \n"
                    + "El hombre cedió a su ambición de ser como Dios menospreciando así la relación tan especial que había disfrutado\n"
                    + "hasta entonces.\n"
                    + "\n"
                    + "¿Qué significa eso para nosotros? Que ese acto de desobediencia abrió la puerta para que el pecado formara parte \n"
                    + "de nuestras vidas. Desde entonces, todos hemos nacido con la tendencia a desobedecer o hacer lo incorrecto\n"
                    + "delante de Dios. Siempre podemos elegir y debemos hacerlo, pero esa tendencia forma ahora parte de nuestro\n"
                    + "impulso natural. No nacemos con la culpa del pecado de Adán y Eva, pero sí con una inclinación natural a desobedecer \n"
                    + "los mandatos de Dios. La Biblia llama a esta tendencia nuestra naturaleza pecaminosa (Romanos 8). \n\n"
                    + "Dios detesta el pecado porque crea una barrera de separación entre él y nosotros y nos aparta de su voluntad. \n"
                    + "La mano del Señor no es corta para salvar, ni es sordo su oído para oír. Son las iniquidades de ustedes las que los separan\n"
                    + "de su Dios. Son estos pecados los que lo llevan a ocultar su rostro para no escuchar. (Isaías 59:1-2)\n");

        } else if (x == 2) {
            JTema.setText("");
            JLTexAreaInfo.setText("");

            JTema.setText("¿Cuáles son las consecuencias del pecado?");
            JLTexAreaInfo.setText("El problema con esa actitud es que es irreal. Realmente sí necesitamos de la voluntad de Dios. \n"
                    + "Dios es nuestro Creador, Él es infinitamente más sabio que nosotros, Él sabe perfectamente lo que es mejor para\n"
                    + "nosotros. De manera que si Dios dice que la mentira no es buena, es porque es así, y necesitamos seguir Su voluntad.\n"
                    + "Si Él dice que el homicidio, el adulterio, el robo…Es pecado, es porque todo eso va en contra de Él, y Él sabe que no es\n"
                    + "lo mejor para nosotros. Sin embargo, el ser humano sigue su propia perspectiva, despreciando la ley de Dios y \n"
                    + "Su voluntad perfecta. \n"
                    + "Cuatro consecuencias del pecado son evidentes en Génesis 3:\n"
                    + "\n"
                    + "1. El pecado dañó nuestra relación con Dios – Génesis 3:7-10: Lo primero que produjo el pecado en el hombre\n"
                    + "fue una separación de Dios. El hombre perdió su comunión con su Creador. Ahora la relación de Dios con el hombre\n"
                    + " es de ira juicio y condenación.\n"
                    + "2. El pecado dañó la relación entre los hombres – Génesis 3:12, 16: El pecado afectó directamente la relación entre\n"
                    + "Adán y Eva. Ya no hay confianza, ahora hay egoísmo y orgullo, Adán está dispuesto a que Eva cargue con la culpa\n"
                    + "sin aceptar la suya. Y además se generó un choque que sería constante entre el hombre y la mujer, en el que la\n"
                    + "mujer trataría de tomar el lugar del hombre, y el hombre sometería, incluso a la fuerza a la mujer. Toda guerra y\n"
                    + "conflicto en la historia del hombre, toda envidia traición y egoísmo, todo odio y conflicto… Es producto finalmente\n"
                    + "del pecado del hombre (Santiago 4:1-2)."
                    + "\n"
                    + "3. El pecado dañó la creación de Dios – Génesis 3:17-18: El hombre fue creado para administrar la creación de Dios. \n"
                    + "La tierra está directamente relacionada con la raza humana, de manera que el pecado del hombre afectó de\n"
                    + "inmediato a la tierra. La tierra se volvió estéril y el hombre se volvió violento en contra de la creación de Dios.\n"
                    + "\n"
                    + "4. El pecado trajo muerte física y eterna – Génesis 2:15-17: Adán no murió inmediatamente, \n"
                    + "pero la muerte se introdujo como consecuencia del pecado. Pero en realidad la más grave consecuencia del\n"
                    + "pecado es la muerte eterna , es la separación eterna de Dios, lejos de Su presencia y de Su gloria para siempre\n"
                    + " (2Tesalonicenses 1:9)");
        }else if (x == 3){
            JTema.setText("");
            JLTexAreaInfo.setText("");
            
            JTema.setText("NO HAY UN CAMINO INTERMEDIO");
            JLTexAreaInfo.setText("Jesús deja en claro que hay solamente dos caminos. \n"
                    + "Afirman los versículos bíblicos Juan 3.18,36: “El que cree en el Hijo de Dios, no está condenado; pero el que no cree\n"
                    + "ya ha sido condenado. El que cree en el Hijo, tiene vida eterna; pero el que no quiere creer en el Hijo, no tendrá\n"
                    + "esta vida, sino que recibirá el terrible castigo de Dios. Tanto para los creyentes devotos como para los escépticos\n"
                    + "e incrédulos por igual; los caminos de la vida a veces son desconcertantes y enigmáticos…. Sí, sin lugar a duda\n"
                    + "muchas veces las sendas que tomamos parecen encerrar un  misterio indescifrable a cada paso que damos.\n"
                    + " Para el ser humano, siempre ha sido difícil enfrentarse a esta realidad; y a las decisiones que debe tomar al\n"
                    + "respecto mientras transita en esta tierra. Sin embargo Dios en su palabra parece mostrarnos que él no\n"
                    + "desea que sea así; creemos esto, porque nos ha dejado diversos recursos para guiarnos eficazmente en nuestro\n"
                    + "peregrinaje en este mundo. La Biblia ha demostrado ser la herramienta por excelencia para tal tarea\n"
                    + "Si, a la hora de transitar los complicados caminos de la vida discerniendo el bien del mal, la Biblia ha demostrado\n"
                    + "ser la mejor y más confiable regla. En ella se hacen muchas referencias al camino que se escoge como la clave\n"
                    + "indispensable para alcanzar nuestro destino;  a continuación mencionaremos y analizaremos algunas\n"
                    + "de estas referencias, dadas por Dios con la finalidad de cuidar nuestros pasos.");
            
        }else if (x == 4){
            JTema.setText("");
            JLTexAreaInfo.setText("");
            
            JTema.setText("QUE CAMINO ESCOGES?");
            JLTexAreaInfo.setText("Esta es una difícil decisión para uno de joven, y mas cuando creces en hogares donde no se le toma suficiente\n"
                    + "importancia a los principios cristianos, donde aun en el mismo hogar se practican cosas que perjudican de una u\n"
                    + "otra manera el desarrollo de tu personalidad; Creces en un ambiente en donde no es malo emborracharte, fumar\n "
                    + "engañar a la esposa(o) andar en parrandas, mentir, robar, tener relaciones sexuales con una y con otra mujer y\n"
                    + "tantas cosas mas. Te dicen no hagas esto porque es malo, pero ellos lo practican continuamente; entonces\n"
                    + "quedamos perdidos y nos preguntamos si lo que hacemos es malo, Porque lo siguen haciendo ellos? esto es bastante\n"
                    + "perjudicial. para un joven que vive en una sociedad en donde a lo malo le llaman bueno y a lo bueno le llaman malo es en estos\n"
                    + "momentos de la vida cuando quedamos como un barco sin brújula en altamar perdidos sin saber realmente a donde debemos ir\n"
                    + "que camino tomar. Por medio de este sitio Dios quiere mostrarte el mejor camino a seguir en la vida, hay solo dos caminos que\n"
                    + "podrás tomar en esta vida, pero solamente uno es el correcto. El rumbo que le des a tu vida será tu decisión; si tomas el camino\n"
                    + "correcto tendrás paz y felicidad para tu vida, tu hogar y tu familia; si tomas el camino incorrecto traerás angustia y dolor para tu\n"
                    + " vida, tu hogar y tu familia.\n"
                    + "");
        }
    }

    public void visor() {

        for (int i = 1; i <= 4; i++) {
            galeria[i] = new ImageIcon(getClass().getResource("/Image/OneWay/i-" + i + ".png"));
        }
        JLCarrusel.setIcon(galeria[1]);
    }

    private void JLHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLHomeMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_JLHomeMouseClicked


    private void JButtonDerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonDerActionPerformed

        if (contador == 4) {

            contador = 0;
        }
        contador++;

        JLCarrusel.setIcon(galeria[contador]);
        JLinfo(contador);
    }//GEN-LAST:event_JButtonDerActionPerformed

    private void JButtonIzquiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonIzquiActionPerformed

        if (contador == 1) {

            contador = 4;
        }
        contador--;

        JLCarrusel.setIcon(galeria[contador]);
        JLinfo(contador);
    }//GEN-LAST:event_JButtonIzquiActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonDer;
    private javax.swing.JButton JButtonIzqui;
    private javax.swing.JLabel JLCarrusel;
    private javax.swing.JLabel JLHome;
    private javax.swing.JTextArea JLTexAreaInfo;
    private javax.swing.JTextField JTema;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
