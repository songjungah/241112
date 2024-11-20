package Day26.TodoList.model;


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class TodoDao {

    // 싱글톤
    private static TodoDao todoDao = new TodoDao();
    private TodoDao() {

        File file = new File("./src/Day26/data.txt");

        if (file.exists()) {    // 지정한 경로에 파일이 있다

            // 싱글톤(static)이 생성될 때
            fileLoad();

        } else {    // 지정한 경로에 파일이 없다

            try {
                file.createNewFile();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
    public static TodoDao getInstance() {
        return todoDao;
    }


    // 입력 객체
    Scanner scan = new Scanner(System.in);

    // 여러개 게시물을 저장하는 리스트
    ArrayList<TodoDto> todoDB = new ArrayList<>();

    // 리스트 등록 접근 함수
    public boolean TodoWrite(TodoDto todoDto) {
        todoDB.add(todoDto);
        fileSave();
        return true;
    }

    // 리스트 출력 접근 함수
    public ArrayList<TodoDto> TodoPrint() {
        return todoDB;
    }


    // 영구저장을 위한 리스트들을 파일에 저장
    public void fileSave() {    // fileSave s

        String outStr = "";

        for (int index = 0; index <= todoDB.size()-1; index++) { // for s

            TodoDto todoDto = todoDB.get(index);

            outStr += todoDto.getContent() + "," + todoDto.getDate() + "," + todoDto.isCondition();

            outStr += "\n";

        }   // for e
        // 확인용
        System.out.println(outStr);


        // 예외처리
         try {  //
             FileOutputStream outputStream = new FileOutputStream("./src/Day26/data.txt");

             outputStream.write(outStr.getBytes());

             System.out.println("파일 저장 성공");

         } catch (FileNotFoundException e) {
             e.printStackTrace();

         } catch (IOException e) {
             e.printStackTrace();
         }
    }   // fileSave e


    // 영구저장 된 파일의 리스트들을 가져오는 기능
    public void fileLoad() {

        try {

            FileInputStream inputStream = new FileInputStream("./src/Day26/data.txt");

            File file = new File("./src/Day26/data.txt");
            byte[] bytes = new byte[(int) file.length()];

            inputStream.read(bytes);

            String intStr = new String(bytes);

            String[] objStr = intStr.split("\n");

            for (int i = 0; i <= objStr.length-1; i++) {    // for s

                String obj = objStr[i];

                String[] field = obj.split(",");
                String content = field[0];
                int date = Integer.parseInt(field[1]);
                boolean condition = Boolean.parseBoolean(field[2]);
                TodoDto todoDto = new TodoDto(content, date, condition);

                todoDB.add(todoDto);
            }   // for e

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
