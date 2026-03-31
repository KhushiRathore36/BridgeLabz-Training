package Set1;

import java.util.*;

class FileVersion {
    String version;
    int size;
    int order;

    FileVersion(String v, int s, int o) {
        version = v;
        size = s;
        order = o;
    }
}

public class VersionControl {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        Map<String, List<FileVersion>> map = new HashMap<>();
        int uploadCounter = 0;

        for (int i = 0; i < n; i++) {

            String line = sc.nextLine();
            String[] parts = line.split(" ");

            String command = parts[0];

            if (command.equals("UPLOAD")) {

                String file = parts[1];
                String version = parts[2];
                int size = Integer.parseInt(parts[3]);

                map.putIfAbsent(file, new ArrayList<>());

                boolean exists = false;

                for (FileVersion fv : map.get(file)) {
                    if (fv.version.equals(version)) {
                        exists = true;
                        break;
                    }
                }

                if (!exists) {
                    map.get(file).add(new FileVersion(version, size, uploadCounter++));
                }
            }

            else if (command.equals("FETCH")) {

                String file = parts[1];

                if (!map.containsKey(file)) {
                    System.out.println("File Not Found");
                    continue;
                }

                List<FileVersion> list = new ArrayList<>(map.get(file));

                Collections.sort(list, (a, b) -> {
                    if (a.size != b.size)
                        return a.size - b.size;
                    return a.version.compareTo(b.version);
                });

                for (FileVersion fv : list) {
                    System.out.println(file + " " + fv.version + " " + fv.size);
                }
            }

            else if (command.equals("LATEST")) {

                String file = parts[1];

                if (!map.containsKey(file)) {
                    System.out.println("File Not Found");
                    continue;
                }

                FileVersion latest = null;

                for (FileVersion fv : map.get(file)) {
                    if (latest == null || fv.order > latest.order)
                        latest = fv;
                }

                System.out.println(file + " " + latest.version + " " + latest.size);
            }

            else if (command.equals("TOTAL_STORAGE")) {

                String file = parts[1];

                if (!map.containsKey(file)) {
                    System.out.println("File Not Found");
                    continue;
                }

                int total = 0;

                for (FileVersion fv : map.get(file))
                    total += fv.size;

                System.out.println(file + " " + total);
            }
        }
    }
}