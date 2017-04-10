package com.java.mastery.enum_exercise;

/**
 * Created by ANAN011 on 10/4/2017.
 * <p>
 * Simple test to test out enum pattern
 */

enum FileTypeEnum {
  PDF("application/pdf"),
  MSWORD("application/msword");

  private String fileType;

  FileTypeEnum(String fileType) {
    this.fileType = fileType;
  }

  public static String getFileType(String fileType) {
    for (FileTypeEnum file : FileTypeEnum.values()) {
      if (file.fileType.equals(fileType)) {
        return file.name();
      }
    }
    return null;
  }
}

public class TestEnum1 {
  public static void main(String[] args) {
    System.out.println(FileTypeEnum.getFileType("application/msword"));
    System.out.println(FileTypeEnum.getFileType("application/pdf"));
  }
}
