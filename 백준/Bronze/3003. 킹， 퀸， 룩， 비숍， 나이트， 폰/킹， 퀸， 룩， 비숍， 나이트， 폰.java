import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int King = 1;
        int Queen = 1;
        int Rook = 2;
        int Bishop = 2;
        int Knight = 2;
        int Pawn = 8;
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int inputKing = Integer.parseInt(st.nextToken());
        int inputQueen = Integer.parseInt(st.nextToken());
        int inputRook = Integer.parseInt(st.nextToken());
        int inputBishop = Integer.parseInt(st.nextToken());
        int inputKnight = Integer.parseInt(st.nextToken());
        int inputPawn = Integer.parseInt(st.nextToken());
        
        bw.write((King - inputKing) + " ");
        bw.write((Queen - inputQueen) + " ");
        bw.write((Rook - inputRook) + " ");
        bw.write((Bishop - inputBishop) + " ");
        bw.write((Knight - inputKnight) + " ");
        bw.write((Pawn - inputPawn) + "\n");
        
        br.close();
        bw.flush();
        bw.close();
    }
}
