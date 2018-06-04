package controllers;

import models.Model;
import views.MatchingGameView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CardController implements ActionListener, MouseListener {
    private Model model;
    private MatchingGameView view;

    public CardController(Model model) {
        this.view = view;
        this.model = model;
    }

    public void setView(MatchingGameView view) {
        this.view = view;
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        switch (command) {
            case "New Game":
                model.setDefaultSettings();
                break;
            case "Exit":
                System.exit(0);
                break;
            case "Rules":
                // TODO: show rules here
                break;
            case "Developers":
                //TODO: show information about developers here
                break;
        }


    }

    public void mouseClicked(MouseEvent e) {

    }

    public void mousePressed(MouseEvent e) {
        int numOfCurCard = view.getNumOfCardsByCoord(e.getXOnScreen(), e.getYOnScreen());
        model.openCard(numOfCurCard);
        model.updateView();
    }

    public void mouseReleased(MouseEvent e) {
        switch (model.getCountOfOpenCards()) {
            case 1:
                //model.makeDelay();
                break;
            case 2:
                if (this.isOpenPairAreEqual()) {
                    model.destroyPair();
                    model.updateView();
                    model.checkWin();
                } else {
                    model.closePair();
                    model.updateView();
                }
                break;
        }

    }

    private boolean isOpenPairAreEqual() {
       return view.equals(model.getOpenCard(0), model.getOpenCard(1));
    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }
}
