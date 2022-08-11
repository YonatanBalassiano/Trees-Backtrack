public class savings {
//    public void Backtrack() {
////        int size = root.height;
////        Deque<Object> Tempstack = new ArrayDeque<Object>();
////        Object[] temp = new Object[3];
////        Object[] add = new Object[3];
////
////        //push the relevant arrays to a second stack - invert order
////        for (int i = 0; i < size; i++) {
////            if(!stack.isEmpty())
////                Tempstack.push(stack.pop());
////        }// in case the tree decrease its height during rotation
////        if (!stack.isEmpty() && !Tempstack.isEmpty()){
////            temp = (Object[])stack.peek();
////            add = (Object[])Tempstack.peek();
////            if (temp[1] == add[1])
////                Tempstack.push(stack.pop());
////        }
////
////        Node toDelete =null;
////        while(!Tempstack.isEmpty()) {
////            //current variables we work with
////            temp = (Object[]) Tempstack.pop();
////            Node node = (AVLTree.Node) temp[0];
////
////            //find the node we want to delete
////            if (toDelete == null){
////                toDelete = toDeleteFinder((int)temp[1]);
////            }
////
////            //backtrack the rotation cases to the original state
////            ImbalanceCases rotation = (ImbalanceCases) temp[2];
////            switch (rotation) {
////                case RIGHT_RIGHT:
////                    right_right(node);
////                    break;
////                case LEFT_RIGHT:
////                    left_right(node);
////                    break;
////                case RIGHT_LEFT:
////                    right_left(node);
////                    break;
////                case LEFT_LEFT:
////                    left_left(node);
////                    break;
////                case NO_IMBALANCE:
////                    break;
////            }
////        }
//
//        //delete the node
//        Object[] temp = (Object[]) stack.pop();
//        AVLTree.Node toDelete =toDeleteFinder((int)temp[1]);
//        AVLTree.Node node = (AVLTree.Node) temp[0];
//        //backtrack the rotation cases to the original state
//        ImbalanceCases rotation = (ImbalanceCases) temp[2];
//        switch (rotation) {
//            case RIGHT_RIGHT:
//                right_right(node);
//                break;
//            case LEFT_RIGHT:
//                left_right(node);
//                break;
//            case RIGHT_LEFT:
//                right_left(node);
//                break;
//            case LEFT_LEFT:
//                left_left(node);
//                break;
//            case NO_IMBALANCE:
//                break;
//        }
//
//        if (toDelete.parent == null){//case the node is the root
//            root = null;
//            return;
//        }
//        else if (toDelete.value > toDelete.parent.value){ // case the node is the right son of this parent
//            toDelete.parent.right = null;}
//        else{ // case the node is the left son of this parent
//            toDelete.parent.left = null;}
//
//        //update heights to nodes above the deleted one
//        while (toDelete!=root){
//            toDelete = toDelete.parent;
//            toDelete.updateHeight();
//        }
//    }


}
