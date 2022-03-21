package com.springBtach.projeto1SpringBatch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*@EnableBatchProcessing
@Configuration
public class BatchConfig {
	@Autowired
	private JobBuilderFactory jobBuilderFactory;

	@Autowired
	private StepBuilderFactory stepBuildFactory;

	public Job imprimeHelloJob() {
		return jobBuilderFactory
				.get("imprimeHelloJob")
				.start(imprimeHelloStep())
				.incrementer(new RunIdIncrementer())
				.build();

	}

	@Bean
	public Step imprimeHelloStep() {
		return stepBuildFactory
				.get("imprimeHelloStep")
				.tasklet(imprimeHelloTasklet(null))
				.build();

	}

	@Bean
	@StepScope
	public Tasklet imprimeHelloTasklet(@Value("#{jobParameters['nome']}")String nome) {
		return new Tasklet() {

@Override
public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		System.out.println("Hello World");
		return RepeatStatus.FINISHED;
}
};
	}

}*/
