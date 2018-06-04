
//    public void turnUp() {
//        if(this.faceUp) {
//            return;
//        }
//        this.faceUp = true;
//        this.faceUp = this.controller.turnUp(this);
//        if(this.faceUp) {
//            this.setIcon(this.faceIcon);
//        }
//    }
//
//    public void turnDown() {
//        if(!this.faceUp) return;
//        this.setIcon(this.backIcon);
//        this.faceUp = false;//card is down
//    }
//
//    public void mousePressed(MouseEvent e) {
//        if(overIcon(e.getX(), e.getY())) {
//            this.mousePressedOnMe = true;
//        }
//    }
//
//    public void mouseReleased(MouseEvent e) {
//        if(this.mousePressedOnMe) {
//            this.mousePressedOnMe = false;
//            this.mouseClicked(e);
//        }
//    }
//
//    public void mouseEntered(MouseEvent e) {
//    }
//
//    public void mouseExited(MouseEvent e) {
//        this.mousePressedOnMe = false;
//    }
//}
