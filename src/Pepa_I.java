import java.util.ArrayList;

public class Pepa_I {
    public static void main(String[] Args) {
        String[] input = "assam enodc erolm utetcesnocr at iuds uiravs utciDm ca enodc ores evl iuqs inicala utnemidnocm otroTr rotcua epmesr arcs a illavnocs uqene divarGa tema ist eget euqilat rreviva esm Ut te enodc ilefs ac auqesnoct eu ugnoce atiVe sillavnoc rterahpa aneceams atseges ipruts ac emaFs ropmet iduticillosn aidm a elo otittroPr saneceam rreviva dommoco usirs evl nunc dauselaMa isin onn allunm eget nudicnitt sinl ubicuafs id rebilo utetcesnoCr rolod uspim erolm reusope udretnim ubicuaFs suten et utceness uqitsirte bromi natibaht uqsetnellepe ilEt subicuaf nunc inem bromi uiravs uqsirelecse aigueft egetnIr niduticillos uqitsirte iuds ilet nicsipidag utetcesnocr emat ist olodr uspIm ibrom eprocmallur esd ilevt eprocmallur ittaMs rotcua ative ecirtlus eu uqsirelecse sini siNl alugil et eipasn anivlupr nunc nudicnitt ssama eidrepmit iuqs dommoCo di auqilam emat ist rterahpa ut tatupluve aidm inem enoDc cnun itselome ullets binh utnemelem itrobols eu croi opmeTr essidnepsus rreviva uiterpm otrotr ut ilevt Id auqila ngama rolode et robale ut nudidicnit opmetr omsuied do esd tile, nicsipidag utetcesnocr tema, ist olodr uspim eroLm"
                .split(" ");
        ArrayList<String> modified = new ArrayList<>();

        for (int i = input.length - 1; i >= 0; i--) modified.add(input[i]);

        for (String inp : modified) {
            StringBuilder unreversed = new StringBuilder();
            unreversed.append(inp);
            String[] temp = unreversed.reverse().toString().split("", 2);
            System.out.print(temp[1] + temp[0] + " ");
        }
    }
}
