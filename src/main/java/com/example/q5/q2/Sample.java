package com.example.q5.q2;

import java.io.File;
import java.io.FileFilter;

public class Sample {
    public static void main(String[] args) {
        File rootDir = new File("C:\\javaStudy\\demo\\src");

        //listFilesメソッドはオーバーロードされており、指定した条件に合致するファイル一覧を取得することも可能。
        FileFilter filter = (path) -> {
            if(path.isDirectory()){
                return true;
            }

            if(path.getName().endsWith(".java")){
                return true;
            }
            return false;
        };

        showTree(rootDir, filter, "");
    }

    private static void showTree(File dir, FileFilter filter, String indent) {
        // listFilesメソッドでfilesの配列を取得
        File[] files = dir.listFiles(filter);

        for (File file : files) {
            System.out.println(indent + file.getName());
            if (file.isDirectory()) {
                showTree(file, filter, indent + " ");
            }
        }
    }
}