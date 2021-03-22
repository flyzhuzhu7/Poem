package com.example.application2.util;

import android.content.Context;
import android.content.res.AssetManager;

import com.example.application2.model.Poem;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PoemUtils {

    /**
     * 读取诗词
     * @param context
     * @param fileName
     * @return
     */
    public static List<Poem> readPoems(Context context, String fileName) {
        List<Poem> list = new ArrayList<>();
        AssetManager manager = context.getAssets();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(manager.open(fileName)));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                list.add(parseJSON(line));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    /**
     * 用Gson解析json格式的数据
     * @param jsonData
     * @return
     */
    private static Poem parseJSON(String jsonData) {
        Gson gson = new Gson();
        return gson.fromJson(jsonData, new TypeToken<Poem>(){}.getType());
    }

}
