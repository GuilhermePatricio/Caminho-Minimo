package GUI;

import Model.No;
import Model.Cores;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Gui
 */
public class Grid extends JPanel {

    private final int linhas;
    private final int colunas;
    private final Cores cor = new Cores();

    public Grid(JLabel mapa[][], ArrayList<No> caminho) {
        this.linhas = mapa.length;
        this.colunas = mapa.length;
        this.setLayout(new GridLayout(this.colunas, this.linhas));
        ActionListener listener = null;

        for (int c = 0; c < this.colunas; c++) {
            for (int l = 0; l < this.linhas; l++) {
                this.add(mapa[c][l]);

            }
        }

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            int indice = caminho.size() - 1;// indice = tam caminho
            int indice2 = indice;//indice aux = indice
            No atual;
            No aux;

            public void run() {
                
                atual = caminho.get(indice);//atual recebe o no na ultima posição da lista
     
                int l = atual.getL();
                int c = atual.getC();

                mapa[l][c].setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Link.png")));
                System.out.println("L = "+caminho.get(indice).getL()+" C = "+caminho.get(indice).getC()+ " Custo = "+caminho.get(indice).getCusto());
                aux = caminho.get(indice2);
                int l1 = aux.getL();
                int c2 = aux.getC();

                mapa[l1][c2].setIcon(null);
                indice2 = indice;
                indice--;

                if (indice == -1) {
                    timer.cancel();
                }

            }
        }, 2, 150);

    }
}
