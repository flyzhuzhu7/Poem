package com.example.application2.main;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.application2.R;
import com.example.application2.model.Poem;
import com.example.application2.ui.PoemActivity;

import java.util.List;

public class PoemAdapter extends RecyclerView.Adapter<PoemAdapter.ViewHolder> {

    private Context context;
    private List<Poem> poemList;

    public PoemAdapter(List<Poem> poemList) {
        this.poemList = poemList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (context == null) {
            //获取全局context
            context = parent.getContext();
        }
        //渲染每一个item的布局
        View view = LayoutInflater.from(context).inflate(R.layout.poem_item, parent, false);

        //设置点击事件，跳转界面
        final ViewHolder holder = new ViewHolder(view);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = holder.getAdapterPosition();
                Poem poem = poemList.get(position);
                Intent intent = new Intent(context, PoemActivity.class);
                intent.putExtra(PoemActivity.POEM_TITLE, poem.getTitle());
                intent.putExtra(PoemActivity.POEM_WRITER, poem.getWriter());
                intent.putExtra(PoemActivity.POEM_CONTENT, poem.getContent());
                intent.putExtra(PoemActivity.POEM_REMARK, poem.getRemark());
                intent.putExtra(PoemActivity.POEM_APPRECIATION, poem.getShangxi());
                intent.putExtra(PoemActivity.POEM_TRANSLATION, poem.getTranslation());
                context.startActivity(intent);
            }
        });
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Poem poem = poemList.get(position);
        holder.title.setText(poem.getTitle());
        holder.writer.setText(poem.getWriter());
        holder.content.setText(poem.getContent());
    }

    @Override
    public int getItemCount() {
        return poemList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        LinearLayout cardView;
        TextView title;
        TextView writer;
        TextView content;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView = (LinearLayout) itemView;
            title = itemView.findViewById(R.id.poem_title);
            writer = itemView.findViewById(R.id.poem_writer);
            content = itemView.findViewById(R.id.poem_content);
        }
    }

}
