/**
 * Copyright (C), 2015-2018, 联想（北京）有限公司
 * FileName: RBTree
 * Author:   yuzj7@lenovo.com
 * Date:     2018/11/6 16:52
 * Description: 红黑树
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package tree;

/**
 *  @Title:RBTree
 * 〈红黑树〉<br>
 *
 * @author yuzj7@lenovo.com
 * @create 2018/11/6-16:52
 * @since JDK1.7
 */
public class RBTree<K extends Comparable<K>,V> {

    public static final boolean RED = true;
    public static final boolean BLACK = false;
    private class Node {
        public Node left,right;
        public boolean color;
        public K key;
        public V value;
        public Node (K key,V value){
            this.key = key;
            this.value = value;
            this.left=null;
            this.right = null;
            color = RED;

        }
    }
}