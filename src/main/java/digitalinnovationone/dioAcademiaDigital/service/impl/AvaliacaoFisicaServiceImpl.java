package digitalinnovationone.dioAcademiaDigital.service.impl;

import digitalinnovationone.dioAcademiaDigital.Entity.Aluno;
import digitalinnovationone.dioAcademiaDigital.Entity.AvaliacaoFisica;
import digitalinnovationone.dioAcademiaDigital.Entity.Form.AvaliacaoFisicaForm;
import digitalinnovationone.dioAcademiaDigital.Entity.Form.AvaliacaoFisicaUpdateForm;
import digitalinnovationone.dioAcademiaDigital.repository.AlunoRepository;
import digitalinnovationone.dioAcademiaDigital.repository.AvaliacaoFisicaRepository;
import digitalinnovationone.dioAcademiaDigital.service.IAvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService {

    @Autowired
    private AvaliacaoFisicaRepository avaliacaoFisicaRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
        AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

        avaliacaoFisica.setAluno(aluno);
        avaliacaoFisica.setPeso(form.getPeso());
        avaliacaoFisica.setAltura(form.getAltura());

        return avaliacaoFisicaRepository.save(avaliacaoFisica);
    }

    @Override
    public AvaliacaoFisica get(Long id) {
        return null;
    }

    @Override
    public List<AvaliacaoFisica> getAll() {

        return avaliacaoFisicaRepository.findAll();
    }

    @Override
    public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}