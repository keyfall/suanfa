package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class AlgoFrame extends JFrame {
    private int canvasWidth;
    private int canvasHeight;

    public AlgoFrame(String title,int canvasWidth,int canvasHeight){
        super(title);

        this.canvasHeight = canvasHeight;
        this.canvasWidth = canvasWidth;


        AlgoCanvas canvas = new AlgoCanvas();
      //  canvas.setPreferredSize(new Dimension(canvasWidth,canvasHeight));
        setContentPane(canvas);
        pack();

        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
    public int getCanvasWidth(){return canvasWidth;}
    public int getCanvasHeight(){return canvasHeight;}

    //画布
    public class AlgoCanvas extends JPanel{
        //Graphics是绘制的上下文环境，连接控件
        @Override
        public  void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D)g;
        //设置笔画宽度
          AlgoVisHelper.setStrokeWidth(g2d,5);

        //线条颜色
            AlgoVisHelper.setColor(g2d,Color.green);
            AlgoVisHelper.fillCircle(g2d,canvasWidth/2,canvasHeight/2,200);


            //基本图形对象,float更快，但是double更方便
           AlgoVisHelper.setColor(g2d,Color.red);
        AlgoVisHelper.strokeCircle(g2d,canvasWidth/2,canvasHeight/2,200);


       // g.drawOval(50,50,300,300);
    }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(canvasWidth,canvasHeight);
        }
    }

}
