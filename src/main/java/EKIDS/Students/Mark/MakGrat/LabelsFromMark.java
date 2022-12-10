package EKIDS.Students.Mark.MakGrat;

import javax.swing.*;

class Labels extends JFrame {
    JPanel pnl = new JPanel();
    JButton btn = new JButton("нажми меня");
//    JButton tickBtn = new JButton(tick);
//    JButton crossBtn = new JButton("STOP", cross);
    ImageIcon duke = new ImageIcon("C:\\Users\\Oleg_Chumin\\IdeaProjects\\EKIDS\\src\\Java\\Students\\Mark\\MakGrat\\duke.png");
    //    ImageIcon cross = new ImageIcon("C:\\Users\\krasn_rhd70wh\\IdeaProjects\\Mark\\src\\Swing\\9fd85d62-9183-4dc4-98cc-111d4f0e8dc9.jpg");
    ImageIcon hello = new ImageIcon("C:\\Users\\Oleg_Chumin\\IdeaProjects\\EKIDS\\src\\Java\\Students\\Mark\\MakGrat\\hello.png");
    JLabel lbl1 = new JLabel(duke);
    JLabel lbl2 = new JLabel("Дюк - талисман технологии Java.");
    JLabel lbl3 = new JLabel("Дюк", duke, JLabel.CENTER);





    public Labels() {
        super("окно swing");
        setSize(500, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        lbl1.setToolTipText("Hello - привет на английском языке");
        add(pnl);
        lbl3.setHorizontalTextPosition(JLabel.CENTER);
        lbl3.setVerticalTextPosition(JLabel.BOTTOM);
        pnl.add(btn);
//        pnl.add(tickBtn);
//        pnl.add(crossBtn);
        pnl.add(lbl1);
        pnl.add(lbl2);
        pnl.add(lbl3);
        setVisible(true);

    }

    public static void main(String[] args) {
        Java.Students.Mark.MakGrat.Labels gui = new Java.Students.Mark.MakGrat.Labels();
    }
}

