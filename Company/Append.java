package Company;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

class Append extends ObjectOutputStream
{
    public Append(OutputStream out) throws IOException
    {
        super(out);
    }

    @Override
    protected void writeStreamHeader()throws IOException
    {
        reset();
    }
}