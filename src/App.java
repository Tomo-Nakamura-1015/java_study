public class App {

    static String name = "トンヌラ";
    // プレイヤーのレベル
    static int level = 20;
    public static void main(String[] args) throws Exception {
        // 序章を表示
        putJyosyou();

        System.out.println( "１、すぐに魔王を倒しに行く。" );
        System.out.println( "２、修行してから魔王を倒しに行く。" );

        int c = System.in.read();

        if( c == '2' ){
            level = 255;
        }

        if( level < 35 ){
            putGameOver();
        }else{
            putGameClear();
        }    
    }

    static void putJyosyou(){
        System.out.println( "誰かが世界を滅ぼそうとしています。" );
        System.out.println( name + "はレベル" + level + "の人です" );
    }

    static void putGameOver(){
        System.out.println( name + "は魔王に負けました。ぴえん。" );
        System.out.println( "GAME OVER!" );
    }

    static void putGameClear(){
        String s1 = name + "は魔王を倒しました！";
        put( s1 );

        System.out.print( "レベル" + level );

        if ( level > 70 ){
            put( "なので余裕でしたwww" );
        }else if( level > 50 ){
            put( "なので倒せました。" );
        }else{
            put( "でしたが超苦戦しました。ぴえん。" );
        }
        put( "GAME CLEAR！" );
    }
    /**/ 
    static void put( String str ){
        System.out.println( str );
    }
}
 