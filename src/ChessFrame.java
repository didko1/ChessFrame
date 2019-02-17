import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChessFrame {
    private JPanel pnlBase;
    private JTextField txtNum;
    private JButton btnExit;
    private JButton btnClear;
    private JButton btnDraw;
    private JPanel pnlDraw;

    public ChessFrame() {
        pnlDraw.setPreferredSize(new Dimension(20,20));

        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnDraw.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num=Integer.parseInt(txtNum.getText());
                double h=(double)pnlDraw.getHeight();
                double w=(double)pnlDraw.getWidth();
                double size=(double)w/num;
                double size1=(double)h/num;
                double x=0;
                double y=0;

                Graphics g=pnlDraw.getGraphics();
                Color c=new Color(0,0,0);
                ///////////////1vi nachin\\\\\\\\\\\\\\
                //1vi red
              //  for (int i = 0; i <=num ; i+=2) {
              //    x=i*size;
              //    g.fillRect((int)x,(int)y,(int)size,(int)size);
              //  }
              ////2ri
              //  y=size;
              //  for (int i = 1; i <=num ; i+=2) {
              //    x=i*size;
              //    g.fillRect((int)x,(int)y,(int)size,(int)size);
              //  }
              ////lqva strana
//
              //  for (int i = 2; i <num-2 ; i+=2) {
              //      for (int j = 0; j <2 ; j+=2) {
              //        g.fillRect((int)x,(int)y,(int)size1,(int)size1);
              //        x=j*size;
              //        y=i*size;
              //      }
//
              //  }
              //  for (int i = 3; i <num-2 ; i+=2) {
              //      for (int j = 1; j <2 ; j+=2) {
              //          g.fillRect((int) x, (int) y, (int) size1, (int) size1);
              //          x = j * size;
              //          y = i * size;
              //      }
              //  }
              ////дясна страна
              //      if(num%2!=1){
              //          for (int i = 3; i <num-1 ; i+=2) {
              //              for (int j = num-1; j <num ; j+=2) {
              //                  g.fillRect((int)x,(int)y,(int)size1,(int)size1);
              //                  x=j*size;
              //                  y=i*size;
              //              }
//
              //          }
              //          for (int i = 2; i <num-2 ; i+=2) {
              //              for (int j = num-2; j <=num ; j+=2) {
              //                  g.fillRect((int)x,(int)y,(int)size1,(int)size1);
              //                  x=j*size;
              //                  y=i*size;
              //              }
              //          }
              //      }
              //      else{
              //          for (int i = 2; i <num-1 ; i+=2) {
              //              for (int j = num-1; j <num ; j+=2) {
              //                  g.fillRect((int)x,(int)y,(int)size1,(int)size1);
              //                  x=j*size;
              //                  y=i*size;
              //              }
//
              //          }
              //          for (int i = 3; i <num-2 ; i+=2) {
              //              for (int j = num-2; j <=num ; j+=2) {
              //                  g.fillRect((int)x,(int)y,(int)size1,(int)size1);
              //                  x=j*size;
              //                  y=i*size;
              //              }
              //          }
              //      }
//
//
              //  //dolna
              //  if(num%2!=0){
              //      y=(num-2)*size;
              //      for (int i = 1; i <=num ; i+=2) {
              //          x=i*size;
              //          g.fillRect((int)x,(int)y,(int)size,(int)size);
//
              //      }
              //      y=(num-1)*size;
              //      for (int i = 0; i <=num-1 ; i+=2) {
              //          x=i*size;
              //          g.fillRect((int)x,(int)y,(int)size,(int)size);
//
              //      }
              //  }
              //  else{
              //      y=(num-1)*size;
              //      for (int i = 1; i <=num ; i+=2) {
              //          x=i*size;
              //          g.fillRect((int)x,(int)y,(int)size,(int)size);
//
              //      }
//
              //      y=(num-2)*size;
              //      for (int i = 0; i <=num-1 ; i+=2) {
              //          x=i*size;
              //          g.fillRect((int)x,(int)y,(int)size,(int)size);
//
              //      }
              //  }
/////////////////////////////2ri nachin\\\\\\\\\\\\\
                for (int i = 0; i <num ; i++) {
                    for (int j = 0; j <num; j++) {
                        if(i%2==0 && j%2==0){
                            g.setColor(c);
                            x=i*size;
                            y=j*size;
                            g.fillRect((int)x,(int)y,(int)size,(int)size);
                            if(i>1 && i<num-2 && j>1 && j<num-2){
                                Color s=new Color(255, 255,255);
                                g.setColor(s);
                                g.fillRect((int)x,(int)y,(int)size,(int)size);
                            }
                        }
                        else if(i%2!=0&&j%2!=0){
                            g.setColor(c);
                            x=i*size;
                            y=j*size;
                            g.fillRect((int)x,(int)y,(int)size,(int)size);
                            if(i>2 && i<num-2 && j>2 && j<num-2){
                                Color s=new Color(255, 255,255);
                                g.setColor(s);
                                g.fillRect((int)x,(int)y,(int)size,(int)size);
                            }
                        }
                    }
                }

            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlDraw.repaint();
                txtNum.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame drawFrame=new JFrame("Draw Frame");
        drawFrame.setContentPane(new ChessFrame().pnlBase);
        drawFrame.setSize(700,700);
        drawFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        drawFrame.setVisible(true);


    }

}

