package catalog;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

import enums.MediaEnum;
import media.Cassette;
import media.CompactDisc;
import media.Media;
import media.VinylRecord;

public class FileCatalog extends CatalogAbstract {
    private String DELIMITER = ";";

    private void saveFile() {
        try {
            BufferedWriter bw = new BufferedWriter(
                    new OutputStreamWriter(new FileOutputStream("media.csv", false), "UTF-8"));

            for (int i = 0; i < size; i++) {
                Media media = mediaCollection[i];
                StringBuffer oneLine = new StringBuffer();

                oneLine.append(media.getName());
                oneLine.append(DELIMITER);
                oneLine.append(media.getAuthor());
                oneLine.append(DELIMITER);
                oneLine.append(media.getYear());
                oneLine.append(DELIMITER);
                oneLine.append(media.getComment());
                oneLine.append(DELIMITER);
                oneLine.append(media.getRating());
                oneLine.append(DELIMITER);

                if (media instanceof CompactDisc) {
                    oneLine.append(MediaEnum.COMPACT_DISC);
                } else if (media instanceof VinylRecord) {
                    oneLine.append(MediaEnum.VINYL_RECORD);
                } else if (media instanceof Cassette) {
                    oneLine.append(MediaEnum.CASSETTE);
                }
                bw.write(oneLine.toString());
                bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (UnsupportedEncodingException e) {
            System.out.println("Problem with code");
        } catch (IOException e) {
            System.out.println("Problem with file");
        }
    }

    private void readFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("media.csv"))) {
            String line;
            String name;
            String author;
            int year;
            String comment;
            double rating;
            MediaEnum mediaEnum;

            while ((line = br.readLine()) != null) {
                String[] values = line.split(DELIMITER);
                name = values[0];
                author = values[1];
                year = Integer.parseInt(values[2]);
                comment = values[3];
                rating = Double.parseDouble(values[4]);
                mediaEnum = MediaEnum.valueOf(values[5]);
                Media media = null;
                
                if (mediaEnum.equals(MediaEnum.COMPACT_DISC)) {
                    media = new CompactDisc(name, author, year, comment, rating);
                } else if (mediaEnum.equals(MediaEnum.VINYL_RECORD)) {
                    media = new VinylRecord(name, author, year, comment, rating);
                } else if (mediaEnum.equals(MediaEnum.CASSETTE)) {
                    media = new Cassette(name, author, year, comment, rating);
                }

                if (media != null) {
                    mediaCollection[size] = media;
                    size++;
                    System.out.println("Post read");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Problem with reading");
        }
    }

    @Override
    public void addMedia(Media media) {
        mediaCollection[size] = media;
        size++;
        saveFile();
    }

    public FileCatalog() {
        readFile();
    }
}
