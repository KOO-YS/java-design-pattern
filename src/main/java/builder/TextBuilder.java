package builder;

public class TextBuilder extends Builder {
    private StringBuffer buffer = new StringBuffer();       // 필드의 문서를 구축

    @Override
    public void makeTitle(String title) {
        buffer.append("==============================\n")
                .append("[").append(title).append("]").append('\n').append('\n');
    }

    @Override
    public void makeString(String str) {
        buffer.append("- "+str+"\n\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (int i=0; i<items.length; i++) {
            buffer.append("+ "+items[i]+'\n');
        }
        buffer.append('\n');
    }

    @Override
    public void close() {
        buffer.append("==============================\n");
    }
    public String getResult() {
        return buffer.toString();
    }
}
