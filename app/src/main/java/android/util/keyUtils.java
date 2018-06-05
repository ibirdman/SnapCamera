package android.util;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


public class keyUtils {
    public static CaptureRequest.Key<?> keyConstructor(String name, Class<?> type) {
        try {
            Class clazz = Class.forName("android.hardware.camera2.CaptureRequest$Key");
            Class[] params = {String.class, Class.class};
            Constructor constructor = clazz.getConstructor(params);
            return (CaptureRequest.Key<?>) constructor.newInstance(name, type);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static CaptureResult.Key<?> keyCaptureResultConstructor(String name, Class<?> type) {
        try {
            Class clazz = Class.forName("android.hardware.camera2.CameraCharacteristics$Key");
            Class[] params = {String.class, Class.class};
            Constructor constructor = clazz.getConstructor(params);
            return (CaptureResult.Key<?>) constructor.newInstance(name, type);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static CameraCharacteristics.Key<?> keyCharacteristicsConstructor(String name, Class<?> type) {
        try {
            Class clazz = Class.forName("android.hardware.camera2.CameraCharacteristics$Key");
            Class[] params = {String.class, Class.class};
            Constructor constructor = clazz.getConstructor(params);
            return (CameraCharacteristics.Key<?>) constructor.newInstance(name, type);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
