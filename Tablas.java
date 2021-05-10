import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Tablas extends JFrame
{
  public Tablas()
  {
    super("Tabla");
    DefaultTableModel modelo=new DefaultTableModel();
    modelo.addColumn("Nombre");
    modelo.addColumn("Apellido");
    modelo.addColumn("Username");
    modelo.addColumn("Telefono");

    String[]p1={"Erick","Sarmiento","mychip","9935910711"};
    String[]p2={"Raul","Estrada","rulo","9933355241"};
    String[]p3={"Kevin","Rodriguez","angelin","9932514788"};
    String[]p4={"Shelly","Ramirez","panter","9935265989"};
    String[]p5={"Erick","Sarmiento","mychip","9935910711"};
    String[]p6={"Raul","Estrada","rulo","9933355241"};
    String[]p7={"Kevin","Rodriguez","angelin","9932514788"};
    String[]p8={"Shelly","Ramirez","panter","9935265989"};
    String[]p9={"Erick","Sarmiento","mychip","9935910711"};
    String[]p10={"Raul","Estrada","rulo","9933355241"};
    String[]p11={"Kevin","Rodriguez","angelin","9932514788"};
    String[]p12={"Shelly","Ramirez","panter","9935265989"};
    String[]p13={"Erick","Sarmiento","mychip","9935910711"};
    String[]p14={"Raul","Estrada","rulo","9933355241"};
    String[]p15={"Kevin","Rodriguez","angelin","9932514788"};
    String[]p16={"Shelly","Ramirez","panter","9935265989"};
    String[]p17={"Erick","Sarmiento","mychip","9935910711"};
    String[]p18={"Raul","Estrada","rulo","9933355241"};
    String[]p19={"Kevin","Rodriguez","angelin","9932514788"};
    String[]p20={"Shelly","Ramirez","panter","9935265989"};
    String[]p21={"Erick","Sarmiento","mychip","9935910711"};
    String[]p22={"Raul","Estrada","rulo","9933355241"};
    String[]p23={"Kevin","Rodriguez","angelin","9932514788"};
    String[]p24={"Shelly","Ramirez","panter","9935265989"};
    String[]p25={"Erick","Sarmiento","mychip","9935910711"};
    String[]p26={"Raul","Estrada","rulo","9933355241"};
    String[]p27={"Kevin","Rodriguez","angelin","9932514788"};
    String[]p28={"Shelly","Ramirez","panter","9935265989"};
    String[]p29={"Erick","Sarmiento","mychip","9935910711"};
    String[]p30={"Raul","Estrada","rulo","9933355241"};
    String[]p31={"Kevin","Rodriguez","angelin","9932514788"};
    String[]p32={"Shelly","Ramirez","panter","9935265989"};
    String[]p33={"Erick","Sarmiento","mychip","9935910711"};
    String[]p34={"Raul","Estrada","rulo","9933355241"};
    String[]p35={"Kevin","Rodriguez","angelin","9932514788"};
    String[]p36={"Shelly","Ramirez","panter","9935265989"};
    String[]p37={"Erick","Sarmiento","mychip","9935910711"};
    String[]p38={"Raul","Estrada","rulo","9933355241"};
    String[]p39={"Kevin","Rodriguez","angelin","9932514788"};
    String[]p40={"Shelly","Ramirez","panter","9935265989"};

    modelo.addRow(p1);
    modelo.addRow(p2);
    modelo.addRow(p3);
    modelo.addRow(p4);
    modelo.addRow(p5);
    modelo.addRow(p6);
    modelo.addRow(p7);
    modelo.addRow(p8);
    modelo.addRow(p9);
    modelo.addRow(p10);
    modelo.addRow(p11);
    modelo.addRow(p12);
    modelo.addRow(p13);
    modelo.addRow(p14);
    modelo.addRow(p15);
    modelo.addRow(p16);
    modelo.addRow(p17);
    modelo.addRow(p18);
    modelo.addRow(p19);
    modelo.addRow(p20);
    modelo.addRow(p21);
    modelo.addRow(p22);
    modelo.addRow(p23);
    modelo.addRow(p24);
    modelo.addRow(p25);
    modelo.addRow(p26);
    modelo.addRow(p27);
    modelo.addRow(p28);
    modelo.addRow(p29);
    modelo.addRow(p30);
    modelo.addRow(p31);
    modelo.addRow(p32);
    modelo.addRow(p33);
    modelo.addRow(p34);
    modelo.addRow(p35);
    modelo.addRow(p36);
    modelo.addRow(p37);
    modelo.addRow(p38);
    modelo.addRow(p39);
    modelo.addRow(p40);

    JTable tabla=new JTable(modelo);
    JScrollPane scroll=new JScrollPane(tabla);
    tabla.setBounds(0,0,600,600);
    setSize(630,650);
    scroll.setBounds(0,0,600,600);
    add(scroll);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(null);
    setVisible(true);
  }  
  public static void main(String[] args) {
    Tablas t1=new Tablas();    
  }
}
