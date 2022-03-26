package com.springBtach.step;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;

public class ImprimeHelloStepConfig {

	@Autowired
	private StepBuilderFactory stepBuilderFactory;

	public Step imprimeHelloStep() {
		return stepBuilderFactory.get("imprimeHelloStep").tasklet(new Tasklet() {
			@Override
			public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
				System.out.println("Hello");
				return RepeatStatus.FINISHED;
			}
		}).build();

	}

}
