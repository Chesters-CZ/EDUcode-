import java.util.HashMap;

public class Pepa_IV {
    public static void main(String[] Args) {
        String[] input = "ucs\nuj\nrml\nyinin\nofldp\nyrztciv\niqvkznlo\neiglbxyo\ncgozmkqiy\nemizumawxh\nwidchpzqcai\nutewlcxkqtai\nxvllkdpzisncyik\nyrxtgjkanhivyxb\nohifwteqbfuxwfr\nxuegisncmhkdqrcuni\nxkkhciwdcmkumffxibivega\neaxpewdszuluqglkvcmm\nidjlsgwhllqplmxeswk\nikgeyublioyjrtlmgizsj\nzoaldurmhbnsyjinrxufyptp\nbhyjfeeczrxfsjqsretokd\nuyhsigomrbivlzzhjblfywztuluelk\nezccwdulszdkhnpqybnzccbk\niqyjflzvehfkvgtnpmjwhancaex\nlklregodmpfkgctbrjszlcofnoewsv\nmplfpsnbqghanfuhiqusobvjtfye\novrtvlgtiyyuqbmrltbcagidoayane\naeasdcisbqcoqcseerdagvmofoqmy\nyclndxussgbrackirbjpgfnqhnbcndw\nbxoanvsqekfwboqryqruddzvpjugbcsty\nadlewhouxemyynenjddumnknqedushai\nojplisahklyufzrtkjyuasmjqucnmsvaxgn\ndxfeaekamcvuhslwnajiudemjgfmeuckio\nyvzwohjpdkouiieupyrjdpavhjehxbsflblde\nxmbvycjfnpadcuhjkblmufymeztcrwghmsimaqgfb\nvpizmwpmigtiizgzibfaigjeynnhlsogzerljkkf\nmlmneprduuscqtffigdtuwspwcdtsslxqoywkw\nwbjwhtxetcovyzgfoawjwaxpkvfgviqktxishov\nernonoedntlajihaziewkdfmveuxeskdsqabwucd\nittubkneaqlcpwrhfckungdpeouxdvkbnwuhcjisg\nolydoxyzxfymbxngzeplrfzxwpvovdlisgmqfjbxty\netatxvjlmeglvuqrweyujhvqnhaqdpyjephpvlptdxgmp\nohrgxxwkqpqitkselmuimnqzijcauizjhrfknjmvsbimdw\ningjnbwexjtgcseydxronfzoiqsbrsgkjydmnjuxszpqk\niigylpapwrtfahwwzahgldeftckbvsxbfvxkezcmepvaigji\nwvksfnlhsouqpltfwctbhoaszwkcqrcujrgsmnppyekzeith\ncdvzyahrpurmjpejjpxmziolngmdfwbaukfsoqornibkepze\nfhfakqgiczgwcpgbbxlvztjxnlmehwuywnepzkrdhefobseaz\nikdwpflxhjoybtsplltfwucnzxwndtcpbtspigrrqwvpnhmnyje".split("\n");
        StringBuilder output = new StringBuilder();
        int loopcount = -1;
        for (String inp : input) {
            loopcount++;
            int[] abeceda = new int[26];
            if (inp.charAt(0) == 97 || inp.charAt(0) == 101 || inp.charAt(0) == 105 || inp.charAt(0) == 111 || inp.charAt(0) == 117 || inp.charAt(0) == 121) {
                System.out.println("yes");
                for (int i = 0; i < inp.length(); i++)
                    abeceda[inp.charAt(i) - 97]++;
                boolean isOk = true;
                for (int j : abeceda)
                    if (j == 2) {
                        isOk = false;
                        break;
                    }
                if (isOk) output.append(inp.charAt(loopcount));
            }
        }
        System.out.println(output);
    }
}
