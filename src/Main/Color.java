package Main;


public enum Color {
    WHITE {
        @Override
        protected boolean isBlack() {
            return false;
        }

        @Override
        protected boolean isWhite() {
            return true;
        }


    },BLACK {
        @Override
        protected boolean isBlack() {
            return true;
        }

        @Override
        protected boolean isWhite() {
            return false;
        }

     
    };


    protected abstract boolean isBlack();
    protected abstract boolean isWhite();
    
    
}
