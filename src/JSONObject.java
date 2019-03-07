public abstract class JSONObject {
    private String key;
    private JSONObject value;

    private JSONObject(String key, JSONObject value){
        this.key = key;
        this.value = value;
    }
}
