package com.yundata.generator.util;

import freemarker.core.ParseException;
import freemarker.template.*;
import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.util.Locale;


@SuppressWarnings("deprecation")
public class FreemarkerUtils {

    private static Configuration getFreemarkerConfig(String templatePath) throws IOException {
        Configuration config = new Configuration();
        String classpath = Thread.currentThread().getContextClassLoader().getResource("").getFile();
        config.setDirectoryForTemplateLoading(new File(classpath + "/" + templatePath));
        config.setEncoding(Locale.CHINA, "utf-8");
        return config;
    }


    /**
     * 用FTL模板生成HTML，并返回HTML内容
     *
     * @param ftlPath    ftl模板文件的路径（不含文件名）
     * @param ftlName    ftl模板文件的名称（不含路径）
     * @param outputFile 输出文件（全路径名称）
     * @param data       数据Map类型，key-value
     * @param charset    编码
     * @throws ParseException
     * @throws IOException
     * @throws TemplateException
     */
    public static String generateToFile(String ftlPath, String ftlName, String outputFile, Object data, String charset) throws IOException {

        File file = new File(outputFile.substring(0, outputFile.lastIndexOf(File.separatorChar)));
        if (!file.exists()) {
            file.mkdirs();
        }
        FileOutputStream fos = new FileOutputStream(outputFile);
        Writer out = new OutputStreamWriter(fos, charset);
        try {
            charset = StringUtils.isBlank(charset) ? "UTF-8" : charset;
            Template tpl = getFreemarkerConfig(ftlPath).getTemplate(ftlName);
            tpl.setEncoding(charset);
            tpl.process(data, out);
            out.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            fos.close();
            out.close();
            return outputFile;
        }
    }

    /**
     * 用FTL模板生成HTML，并返回HTML内容
     *
     * @param ftlPath ftl模板文件的路径（不含文件名）
     * @param ftlName ftl模板文件的名称（不含路径）
     * @param o       数据 Map类型，key-value
     * @param charset 编码
     * @return
     * @throws ParseException
     * @throws IOException
     * @throws TemplateException
     */
    public static String generateToString(String ftlPath, String ftlName, Object o, String charset) throws IOException, TemplateException {

        charset = StringUtils.isBlank(charset) ? "UTF-8" : charset;

        String html = null;

        Template tpl = getFreemarkerConfig(ftlPath).getTemplate(ftlName);
        tpl.setEncoding(charset);

        StringWriter writer = new StringWriter();
        tpl.process(o, writer);
        writer.flush();
        html = writer.toString();
        return html;
    }

}
