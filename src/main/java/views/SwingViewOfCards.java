package views;

import controllers.CardController;
import org.jetbrains.annotations.NotNull;
import javax.swing.*;

public class SwingViewOfCards extends JLabel {
    private Icon faceIcon;
    private Icon backIcon;
    int numOfCard;
    private MatchingGameView mainView;
    private int iconHeightHalf;
    private int iconWidthHalf;
    private CardController controller;
    boolean isFaceUp = false;

    public SwingViewOfCards(@NotNull Icon face, @NotNull Icon back, int numOfCard, CardController controller) {
        super(back);
        this.faceIcon = face;
        this.backIcon = back;
        this.numOfCard = numOfCard;
        this.controller = controller;
        this.addMouseListener(controller);
    }

    public int getNumOfCard() {
        return this.numOfCard;
    }

    public Icon getFaceIcon() {
        return this.faceIcon;
    }

    public boolean isFaceUp() {
        return isFaceUp;
    }

    public void setFaceUp(boolean state) {
        this.isFaceUp = state;
    }

}

